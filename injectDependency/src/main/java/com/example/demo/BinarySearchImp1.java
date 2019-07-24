package com.example.demo;

import java.util.Arrays;

public class BinarySearchImp1 {
	
	SortAlgorithm sortAlgorithm;
	
	public BinarySearchImp1(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	
	public int search(int[] numbers, int numberToSearchFor) {
		sortAlgorithm.sort(numbers);
		return Arrays.binarySearch(numbers, numberToSearchFor);
	}
}