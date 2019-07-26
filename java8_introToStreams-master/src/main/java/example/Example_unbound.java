package example;

import java.util.stream.Stream;

public class Example_unbound {

	public static void main(String[] args) {
		// stream unbound
		Item item = new Item("AA");

		// ->GENERATE STREAM ITEM
		Stream<Item> streamItems = Stream.generate(() -> new Item());

		// ->GENERATE STREAM ITEM
		Stream<String> streamStrings = Stream.generate(item::getName);
		streamStrings.forEach(System.out::println);

	}

}
