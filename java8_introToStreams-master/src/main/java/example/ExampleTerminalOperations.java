package example;

import java.util.stream.Stream;

public class ExampleTerminalOperations {

	public static void main(String[] args) {
		String[] munsters = { "Herman", "Lily", "Eddie", "it" };
		
		System.out.print("\nTotal number of munsters: ");
		System.out.println(Stream.of(munsters).count());
		
		System.out.print("\nFirst number of munsters: ");
		System.out.println(Stream.of(munsters).findFirst().get());
	}

}
