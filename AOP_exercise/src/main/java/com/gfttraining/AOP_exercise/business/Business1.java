package com.gfttraining.AOP_exercise.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfttraining.AOP_exercise.dao.DaoA;

import com.gfttraining.AOP_exercise.dao.DaoB;

@Service
public class Business1 {
	
	@Autowired
	private DaoA daoA;
	
	@Autowired
	private DaoB daoB;
	
	public String calculateSomething(){
		//Business Logic
		System.out.println("Inside Business1");
		return daoA.retrieveSomething().concat(daoB.retrieveSomething());
	}
}