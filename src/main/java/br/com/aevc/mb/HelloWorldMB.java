package br.com.aevc.mb;

import javax.inject.Named;

@Named
public class HelloWorldMB {

	public HelloWorldMB() {
		System.out.println("HelloWorld started!");
	}

	public String getMessage() {
		return "Hello World!";
	}
}
