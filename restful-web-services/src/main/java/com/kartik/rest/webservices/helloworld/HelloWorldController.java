package com.kartik.rest.webservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@GetMapping( "/hello-world")
	public String HelloWolrd() {
		return "Hello World";
	}
	
    //Creating Bean 
	@GetMapping( "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	
	///hello-world/path-variable/Kartik
	@GetMapping( "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World,%s",name));
	}
}

