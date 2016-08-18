package com.ranuka.webService;

import javax.xml.ws.Endpoint;

public class AppLoader {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/WS/HelloWorld", new HelloWorldImpl());
	}
}
