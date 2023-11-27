package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class GreetingBaseResource {

    @GET
    @Path("/baseHello")
    @Produces(MediaType.TEXT_PLAIN)
    public String baseHello() {
        return "Hello RESTEasy.. from inheritence";
    }
}
