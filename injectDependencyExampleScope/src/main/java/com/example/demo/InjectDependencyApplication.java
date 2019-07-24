package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InjectDependencyApplication {
	

	public static void main(String[] args) {
		// SpringApplication.run(InjectDependencyApplication.class, args);

		//BinarySearchImp1 bs = new BinarySearchImp1(new Sort_A());
		//System.out.println(bs.search(new int[] {1,2,3},2));
		
		ApplicationContext ac=SpringApplication.run(InjectDependencyApplication.class, args);
		
		SortAlgorithm sort_A1 = ac.getBean(Sort_A.class);
		System.out.println("Sort_A1 = "+sort_A1);
		
		SortAlgorithm sort_A2 = ac.getBean(Sort_A.class);
		System.out.println("Sort_A2 = "+sort_A2);
		
		SortAlgorithm sort_B1 = ac.getBean(Sort_B.class);
		System.out.println("Sort_B1 = "+sort_B1);
		
		SortAlgorithm sort_B2 = ac.getBean(Sort_B.class);
		System.out.println("Sort_B2 = "+sort_B2);
		

	}

}

