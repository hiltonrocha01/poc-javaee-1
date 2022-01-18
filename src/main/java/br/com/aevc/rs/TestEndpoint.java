package br.com.aevc.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("/test")
public class TestEndpoint extends Application {

	@GET
	public String getOrders() {
		return "HELLO WORLD FROM REST";
	}

}