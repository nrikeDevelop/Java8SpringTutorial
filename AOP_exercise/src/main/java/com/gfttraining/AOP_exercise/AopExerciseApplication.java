package com.gfttraining.AOP_exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.gfttraining.AOP_exercise.business.Business1;
import com.gfttraining.AOP_exercise.business.Business2;

@SpringBootApplication
public class AopExerciseApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(AopExerciseApplication.class, args);
		
		Business1 business1 = applicationContext.getBean(Business1.class);
		
		Business2 business2 = applicationContext.getBean(Business2.class);
		
		System.out.println(business1.calculateSomething());
		System.out.println(business2.calculateSomething());
	}
}
