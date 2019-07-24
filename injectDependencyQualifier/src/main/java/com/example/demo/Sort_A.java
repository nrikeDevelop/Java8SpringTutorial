package com.example.demo;

import java.util.Arrays;


public class Sort_A implements SortAlgorithm {
	@Override
	public void sort(int[] numbers) {
		System.out.println("In sortA");
		Arrays.sort(numbers);
	}

}
