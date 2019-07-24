package com.gftraining.firstSteps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowWorldController {

	@RequestMapping(path = "hello1", method = RequestMethod.GET)
	@ResponseBody
	public String hello1() {
		return "hello 1";
	}

	@GetMapping("/hello2")
	@ResponseBody
	public String hello2() {
		return "hellow 2 get mapping";
	}
	/*
	 * @RequestMapping(path="hello2",method=RequestMethod.GET)
	 * 
	 * @ResponseBody public String hello2() { return "hello 2"; }
	 */

	@GetMapping("hello3")
	@ResponseBody
	public String hello3(@RequestParam() String name) {
		return name;
	}

	@GetMapping("hello4/{name}")
	@ResponseBody
	public String hello4(@PathVariable() String name) {
		return name;
	}

}
