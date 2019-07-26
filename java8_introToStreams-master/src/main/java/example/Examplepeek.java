package example;

import java.util.Arrays;

public class Examplepeek {

	public static void main(String[] args) {
		String[] munsters = { "Herman", "Lily", "Eddie", "it" };

		/*
		 * Arrays.stream(munsters) 
		 * .filter(x -> x.length() > 4)
		 * .map(String::toUpperCase)
		 * .forEach(System.out::println);
		 */

		Arrays.stream(munsters)
		.peek(System.out::println)
		.filter(x -> x.length() > 4).map(String::toUpperCase)
		.peek(System.out::println)
		.forEach(System.out::println);

	}

}
