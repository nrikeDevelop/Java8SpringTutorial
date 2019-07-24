package com.gfttraining.apirest.user;

import java.util.Date;import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description="Information about the system user")
public class User {
	private Integer id;
	private String Name;
	private Date birthDate;

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		Name = name;
		this.birthDate = birthDate;
	}
	
	public User() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
