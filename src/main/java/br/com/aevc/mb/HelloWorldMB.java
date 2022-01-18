package br.com.aevc.mb;

import javax.inject.Named;

//import com.google.gson.Gson;

@Named
public class HelloWorldMB {

	public HelloWorldMB() {
		System.out.println("HelloWorld started!");
//		new Gson();
	}

	public String getMessage() {
		return "Hello World!";
	}
}
