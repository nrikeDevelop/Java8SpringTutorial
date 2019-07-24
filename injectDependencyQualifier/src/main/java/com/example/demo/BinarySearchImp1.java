package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImp1 {
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	
	
	public int search(int[] numbers, int numberToSearchFor) {
		sortAlgorithm.sort(numbers);
		return Arrays.binarySearch(numbers, numberToSearchFor);
	}
}