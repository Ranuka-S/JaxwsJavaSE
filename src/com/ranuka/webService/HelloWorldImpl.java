package com.ranuka.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class HelloWorldImpl implements Helloworld{

	@Override
	@WebMethod
	public String HelloWorld(String name) {
		
		return "Hello "+name;
	}

}
