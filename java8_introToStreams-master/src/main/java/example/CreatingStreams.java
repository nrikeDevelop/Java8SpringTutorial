package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// CREATE STRINGS

		// -> FROM COLLECTION
		List<String> myList = new ArrayList<>();
		myList.add("uno");
		myList.add("dos");
		myList.add("tres");
		myList.add("cuatro");
		myList.add("cinco");

		// show data with stream
		System.out.println("\nShow data from collection:");
		myList.stream().forEach(x -> System.out.println("show data " + x));

		// -> FROM ARRAYS
		System.out.println("\nShow data from array:");
		String[] munsters = { "Herman", "Lily", "Eddie", "it" };
		Arrays.stream(munsters);// or
		Stream.of(munsters);

		// -> FROM VALUES
		System.out.println("\nShow data from values:");
		Stream.of("uno", "dos", "tres");
		Stream.of(1, 2, 3);
		IntStream intStream = IntStream.of(1, 2, 3);
		System.out.println("\nShow data from array");
		System.out.println(intStream.sum());

		// -> GENERATE VALUES

		System.out.println("\nGenerated range");
		IntStream.range(1, 6).forEach(x -> System.out.println(x));// specific range
		new Random().ints(6, 0, 33).forEach(x -> System.out.println(x));
		;// random range

	}
}
