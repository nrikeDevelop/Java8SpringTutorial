package com.gftraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext ap = SpringApplication.run(AopExampleApplication.class, args);
		
		//CREATE OBJETS
		Smiths smiths = ap.getBean(Smiths.class);
		FrankShore frankShore = ap.getBean(FrankShore.class);

		//WITHOUT EXCEPTION
		smiths.perform();
		
		//WITH FORCE EXCEPTION
		try {
			frankShore.perform();
		}catch(Exception e) {
			System.out.println("Excepción lanzada : "+e.getMessage());
		}
		
	}

}
