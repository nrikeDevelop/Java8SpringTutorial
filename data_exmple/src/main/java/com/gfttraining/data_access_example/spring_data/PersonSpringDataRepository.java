package com.gfttraining.data_access_example.spring_data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfttraining.data_access_example.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
	// Custom querys JPA
	Person findByName(String name);

	List<Person> findByNameOrderByLocationAsc(String name);
}
