package com.example.demo;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class Sort_B implements SortAlgorithm {

	@Override
	public void sort(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("In SortB");
		Arrays.sort(numbers);

	}

}
