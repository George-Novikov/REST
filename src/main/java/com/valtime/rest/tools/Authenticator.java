package com.valtime.rest.tools;

import com.valtime.rest.entities.User;

import java.io.Closeable;
import java.io.IOException;
import java.util.Base64;

public class Authenticator{
    public static User authenticate(String credentials){
        String authorization = decodeCredentials(credentials);
        String[] authParts = authorization.split(":");

        return UsersStorage.selectUser(authParts[0], authParts[1]);
    }

    private static String decodeCredentials(String credentials){

        String[] headerParts = credentials.split("\\s+");
        String header = headerParts[1];

        byte[] buffer = buffer = Base64.getDecoder().decode(header);

        return new String(buffer);
    }
}
