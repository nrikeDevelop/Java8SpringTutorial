package com.gfttraining.AOP_exercise.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gfttraining.AOP_exercise.dao.DaoA;
import com.gfttraining.AOP_exercise.dao.DaoB;



@Service
public class Business2 {
	
	@Autowired
	private DaoB daoB;
	
	public String calculateSomething(){
		//Business Logic
		System.out.println("Inside Business2");
		return daoB.retrieveSomething();
	}
}