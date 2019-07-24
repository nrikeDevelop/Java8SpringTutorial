package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Sort_A implements SortAlgorithm {
	@Override
	public void sort(int[] numbers) {
		System.out.println("In sortA");
		Arrays.sort(numbers);
	}

}
