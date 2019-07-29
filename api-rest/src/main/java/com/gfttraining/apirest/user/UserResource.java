package com.gfttraining.apirest.user;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;


@RestController
public class UserResource {

	@Autowired
	private UserDaoService serviceUser;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return serviceUser.findAll();
	}

	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public void createUser(@RequestBody User user) {
		serviceUser.save(user);
	}
	
	/*
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		User user =  serviceUser.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("user with : " + id + " not exist");
		}
		return user;
	}
	*/
	
	@GetMapping("/users/{id}")
	public Resource retrieveUser(@PathVariable int id) {
		User user =  serviceUser.findOne(id);
		if(user==null) {
			throw new UserNotFoundException("user with : " + id + " not exist");
		}
		
		Resource<User> resource = new Resource<>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retriveAllUsers());
		resource.add(linkTo.withRel("all-users"));
		
		return resource;
	}
	
	

}
