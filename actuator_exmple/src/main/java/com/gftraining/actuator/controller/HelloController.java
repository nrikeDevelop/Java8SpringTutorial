package com.gftraining.actuator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	@GetMapping(path="/hello")
	public String doSomething() {
		
		return "Afayaivos a SpringBoot";
		
	}
}
