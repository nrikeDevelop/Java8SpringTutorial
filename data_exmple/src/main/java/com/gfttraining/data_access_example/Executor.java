package com.gfttraining.data_access_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gfttraining.data_access_example.Springjdbc.PersonSpringJdbc;
import com.gfttraining.data_access_example.jdbc.PersonJdbcDAO;


@Component
public class Executor implements CommandLineRunner {

	/*
	@Autowired
	PersonJdbcDAO pjd;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("MUESTRA DATOS");
		System.out.println(pjd.findAll());

	}
	*/
	
	@Autowired
	PersonSpringJdbc psjd;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("MUESTRA DATOS");
		System.out.println(psjd.findAll());
		System.out.println(psjd.deleteById(10002));
		System.out.println(psjd.findAll());


	}

}
