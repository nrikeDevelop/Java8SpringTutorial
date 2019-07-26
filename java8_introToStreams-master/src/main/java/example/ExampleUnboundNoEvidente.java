package example;

import java.util.stream.IntStream;

public class ExampleUnboundNoEvidente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Example1");
		IntStream.iterate(10, i -> i+5).limit(5).forEach(System.out::println);
		
		System.out.println("Example2");
		IntStream.iterate(0, i -> (i+1)%5).limit(12).forEach(System.out::println);
		
		System.out.println("Example3");
		IntStream.iterate(0, i -> (i+1)%5).limit(12).distinct().forEach(System.out::println);
		
		System.out.println("Example4");
		IntStream.iterate(0, i -> (i+1)%5).distinct().limit(12).forEach(System.out::println);
		
	}
}
