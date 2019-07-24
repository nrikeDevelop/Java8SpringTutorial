package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoApplicationController {

	@GetMapping("/hello")
	public String sayHello(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			@RequestParam(value = "name", required = false, defaultValue = "World") String test,
			Model model) {
		model.addAttribute("user", name);
		model.addAttribute("test", test);
		return "hello";
	}
}