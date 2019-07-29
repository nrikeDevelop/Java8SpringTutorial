package com.api.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.exercise.model.Product;

@RestController
public class ApiExerciseResource {

	@Autowired
	ApiExerciseService  apiExerciseService;
	
	@GetMapping("/products/{id}")
	public Product retrieveProductById(@PathVariable int id) {
		return apiExerciseService.findById(id);
	}
	
	@PostMapping("/products")
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody Product product) {
		apiExerciseService.insert(product);
	}
	
	@DeleteMapping("/products/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public void deleteProduct(@PathVariable int id) {
		apiExerciseService.delete(id);
	}
	
}
