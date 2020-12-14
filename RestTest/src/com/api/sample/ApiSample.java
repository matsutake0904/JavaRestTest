package com.api.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.mkjson.*;

@Path("/Sample")
public class ApiSample {
	public String testJson;
    @Path("/hello")
    @GET
//    @Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
    @Produces("application/json")
    public String hello(){
    	this.testJson = new MkJson().mkJson();
        return this.testJson;
    }
	@Path("/content")
    @GET
//    @Produces(MediaType.TEXT_HTML + "; charset=UTF-8")
    @Produces("application/json")
    public String content(){
    	this.testJson = "{ID: 5, title: 'test', content: 'testtest', date: '2020-09-22'}";
        return this.testJson;
    }
}