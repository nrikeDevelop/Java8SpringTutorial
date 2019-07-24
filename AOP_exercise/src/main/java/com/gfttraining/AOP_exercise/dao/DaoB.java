package com.gfttraining.AOP_exercise.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DaoB {

	public String retrieveSomething(){
		System.out.println("Inside DaoB");
		return "DaoB";
	}

}