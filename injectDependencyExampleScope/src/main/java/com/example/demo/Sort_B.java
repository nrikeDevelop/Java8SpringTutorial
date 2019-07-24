package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //DEFINE A NEW OBJECT
public class Sort_B implements SortAlgorithm {

	@Override
	public void sort(int[] numbers) {
		// TODO Auto-generated method stub
		System.out.println("In SortB");
		Arrays.sort(numbers);

	}

}
