package com.gfttraining.data_access_example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gfttraining.data_access_example.entity.Person;

@Repository
public class PersonJdbcDAO {

	
	@Autowired
	DataSource datasource;

	public List<Person> findAll(){
	      System.out.println("Inside jdbc findAll");
	      
	      List<Person> persons = new ArrayList<>();
	      
	      try {
	         Connection conn = datasource.getConnection();
	         Statement stmt = conn.createStatement();
	         ResultSet rs = stmt.executeQuery("select * from person");
	         
	         while (rs.next()) {
	        	 Person person = new Person(
	        			 rs.getInt("id"),
	        			 rs.getString("name"),
	        			 rs.getString("location"),
	        			 rs.getTimestamp("birth_date")
	        			 );
	        	 persons.add(person);
	           
	         }
	         
	         stmt.close();
	         conn.close();
	         
	         return persons;   
	         
	      } catch (SQLException e) {
	        
	           e.printStackTrace();
	      } catch(NullPointerException e){
	        System.out.println("Null Pointer exception");
	    }
		return null;

	  }
}
