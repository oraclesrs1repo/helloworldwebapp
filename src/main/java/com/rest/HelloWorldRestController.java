package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/rest")
public class HelloWorldRestController {
	
	@GET
	@Path("/hello")
	public Response sayHello(){
		return Response.status(200).entity("Hello Welcome to Tavant Mr.Anantaraj").build();
	}
	
	
	@GET
	@Path("/bye")
	public Response sayBye(){
		return Response.status(200).entity("Good Bye Anantaraj").build();
	}

}
