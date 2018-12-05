package com.fabio.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
	
	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
}
