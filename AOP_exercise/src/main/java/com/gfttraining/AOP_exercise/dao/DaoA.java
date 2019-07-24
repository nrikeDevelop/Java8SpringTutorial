package com.gfttraining.AOP_exercise.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoA {

	public String retrieveSomething(){
		System.out.println("Inside DaoA");
		return "DaoA";
	}

}