package com.valtime.rest.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import javax.management.Notification;
import java.util.EventObject;

@Path("/notifications")
public class NotificationResource {
    @GET
    @Path("/ping")
    public Response ping(){
        Response.ResponseBuilder ping = Response.ok().entity("Service is online");
        return ping.build();
    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNotification(@PathParam("id") int id){
        Response.ResponseBuilder get = Response.ok().entity(new Notification("notification", "This is a sample notification by REST API.", id));
        return get.build();
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNotification(RestNotification restNotification){
        Notification notification = new Notification(restNotification.getType(), restNotification.getSource(), restNotification.getSequenceNumber());
        Response.ResponseBuilder post = Response.status(201).entity(notification);
        return post.build();
    }
}
