package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class Calculator {
    @GET
    @Path("/add/{one}/{two}")
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@PathParam("one") int one, @PathParam("two") int two) {
        return String.valueOf(one+two);
    }
}
