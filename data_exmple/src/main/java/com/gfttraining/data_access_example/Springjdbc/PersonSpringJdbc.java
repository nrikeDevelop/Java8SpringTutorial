package com.gfttraining.data_access_example.Springjdbc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gfttraining.data_access_example.entity.Person;





@Repository
public class PersonSpringJdbc {
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Person> findAll(){
		return jdbctemplate.query("select * from person",
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public Person findById(int id){
		return jdbctemplate.queryForObject
				("select * from person where id=?",new Object[] { id }, 
				new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id){
		return jdbctemplate.update("delete from person where id=?", new Object[] { id });
	}
	
}
