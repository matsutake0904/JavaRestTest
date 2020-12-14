package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class TestRest2 {
	private String tsetJson = "{ test: 'aaa'}";
	
	@Path("/get")
	@GET
	@Produces("application/json")
	public String getJson() {
		return this.tsetJson;
	}
}
