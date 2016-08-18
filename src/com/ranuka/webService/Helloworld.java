package com.ranuka.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Helloworld {

	@WebMethod
	public String HelloWorld(String name);
}
