package com.study.study;

import org.springframework.stereotype.Component;

@Component
public class Component2 {

	public void msg(String msg) {
		System.out.println("Component1 : "+msg);
	}
}
