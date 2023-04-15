package com.valtime.rest.resources;

import com.valtime.rest.entities.User;
import com.valtime.rest.tools.Authenticator;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/authentication")
public class AuthenticationResource {
    @GET
    @Path("/login")
    public Response login(@HeaderParam("authorization") String authorization) {
        User user = Authenticator.authenticate(authorization);
        Response.ResponseBuilder login = null;
        String message = "";

        if (user != null) {
            message = "Welcome, " + user.getUsername() + "! You have successfully logged in. Your access level is " + user.getAccessLevel().label + ".";
            login = Response.ok().entity(message);
        } else {
            message = "Failed to login.";
            login = Response.status(401).entity(message);
        }

        return login.build();
    }
}
