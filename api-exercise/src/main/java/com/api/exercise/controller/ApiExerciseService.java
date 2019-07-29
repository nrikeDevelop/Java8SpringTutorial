package com.api.exercise.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.api.exercise.model.Product;

@Repository
@Transactional
public class ApiExerciseService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Product> findAll(){
		TypedQuery<Product> tq = entityManager.createNamedQuery("find_all_products",Product.class);
		return tq.getResultList();
	}

	public Product findById(int id) {
		return entityManager.find(Product.class, id);
	}
	
	public Product update(Product product) {
		return entityManager.merge(product);
	}
	
	public Product insert(Product product) {
		return entityManager.merge(product);
	}
	
	public void delete(int id) {
		Product pr = this.findById(id);
		try {
			entityManager.remove(pr);
		}catch(Exception e) {
			System.out.println("ERROR " + e.getMessage()	);
		}
	}


}
