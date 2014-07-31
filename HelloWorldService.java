package com.seetesh.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
 
@Path("/hello")

public class HelloWorldService {

@Context
SecurityContext securityContext; 
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "Jersey say : " + msg;
		String aa = " ";
//		aa = aa + securityContext.getUserPrincipal().getName(); 
		String outputa = output + " : aa = " + aa;
		System.out.println(outputa);
		return Response.status(200).entity(output).build();
	}

	
	@GET
	@Path("/seet/{param}")
	public Response getNewMsg(@PathParam("param") String msg) {
		String output = "New Jersey say : " + msg;
		return Response.status(200).entity(output).build();
	}

}
