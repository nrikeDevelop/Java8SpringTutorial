package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.BinarySearchImp1;

@Component
public class Executor implements CommandLineRunner {
	
	@Autowired
	BinarySearchImp1 binarySearchBean;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running Executor");
		System.out.println(" In executor : " + binarySearchBean.search(new int[] {1,2,3},2));

	}

}
