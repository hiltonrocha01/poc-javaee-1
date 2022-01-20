package br.com.aevc.example.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
//BEAN GERENCIAVEL
public class HelloWorldMB {

	public HelloWorldMB() {
		System.out.println("HelloWorld started!");
	}

	public void cadastrar(String nome) {

	}

	public String getMessage() {
		return "Hello World!";
	}

	public String getMessage2() {
		return "Hello World! FROM MANAGED BEANS COM CDI";
	}

}
