package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOneUse {

	public static void main(String[] args) {
		

		//STREAMS ONLY CAN BE USE ONE TIME
		// ->GENERATE STREAM ITEM
		Stream<String> streamStrings = Stream.generate(new Item("AA")::getName);

		streamStrings.limit(5).forEach(System.out::println);
		//IF EXECUTE TWO STREAMS ( THE SAME )
		//streamStrings.limit(6).forEach(System.out::println);
		
		//PARALEL
		List<String> lista = new ArrayList<>();
		lista.add("1");
		lista.add("2");
		
		Stream streamParalelo = lista.parallelStream();
		streamParalelo.forEach(System.out::println);
		streamParalelo.forEach(System.out::println);

	}

}
