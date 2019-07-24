package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectDependencyApplication {

	public static void main(String[] args) {
		// SpringApplication.run(InjectDependencyApplication.class, args);

		BinarySearchImp1 bs = new BinarySearchImp1(new Sort_A());
		System.out.println(bs.search(new int[] {1,2,3},2));

	}

}

