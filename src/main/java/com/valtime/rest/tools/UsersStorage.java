package com.valtime.rest.tools;

import com.valtime.rest.entities.User;

import java.util.HashMap;
import java.util.Map;

public class UsersStorage {
    private static Map<Integer, User> users = new HashMap<>() {{
        put(1, new User("root", "root", AccessLevel.ROOT));
        put(2, new User("admin", "master", AccessLevel.ADMIN));
        put(3, new User("George", "user1", AccessLevel.USER));
        put(4, new User("Sarah", "user2", AccessLevel.USER));
        put(5, new User("stranger", "anykey", AccessLevel.USER));
    }};

    public static Map<Integer, User> deriveStorage(){
        return users;
    }

    public static User selectUser(String username, String password){
        User user = null;

        for (Map.Entry<Integer, User> item : users.entrySet()){
            User userBuffer = item.getValue();

            if (userBuffer.getUsername().equals(username) && userBuffer.getPassword().equals(password)){
                user = userBuffer;
            }
        }
        return user;
    }

    public static User selectUserById(int id){
        User user = null;

        for (Map.Entry<Integer, User> item : users.entrySet()){
            if (item.getKey() == id){
                user = item.getValue();
            }
        }
        return user;
    }
}
