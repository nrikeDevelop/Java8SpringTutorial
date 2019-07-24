package com.gfttraining.data_access_example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.gfttraining.data_access_example.Springjdbc.PersonSpringJdbc;
import com.gfttraining.data_access_example.entity.Person;
import com.gfttraining.data_access_example.jdbc.PersonJdbcDAO;
import com.gfttraining.data_access_example.jpa.PersonJPARepository;
import com.gfttraining.data_access_example.spring_data.PersonSpringDataRepository;

@Component
public class Executor implements CommandLineRunner {

	@Autowired
	PersonJdbcDAO pjd;

	@Autowired
	PersonSpringJdbc psjd;

	@Autowired
	PersonJPARepository pjr;

	@Autowired
	PersonSpringDataRepository psdr;

	@Override
	public void run(String... args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("\n");
			System.out.println("MENU");
			System.out.println("\n");
			System.out.println("1.PersonJdbcDAO");
			System.out.println("2.PersonSpringJdbc");
			System.out.println("3.PersonJPARepository");
			System.out.println("4.PersonSpringDataRepository");
			System.out.println("\nIntroduce option : ");
			
			String opt = reader.readLine();
			switch (opt) {
			case "1":
				System.out.println("MUESTRA DATOS");
				System.out.println(psjd.findAll());
				System.out.println(psjd.deleteById(10002));
				System.out.println(psjd.findAll());
				break;
			case "2":
				System.out.println(psjd.myMapper());
				break;
			case "3":
				System.out.println(pjr.findAll());
				break;
			case "4":
				System.out.println(">>>" + psdr.findByNameOrderByLocationAsc("Pepe"));
				break;
			}
		}
	}

}
