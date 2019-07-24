package com.gfttraining.apirest.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String helloWorld() {
		return("Hello world");
	}
	
	@GetMapping("/helloBean")
	public HelloBean helloBean() {
		return new HelloBean("This is a message");
	}
}
