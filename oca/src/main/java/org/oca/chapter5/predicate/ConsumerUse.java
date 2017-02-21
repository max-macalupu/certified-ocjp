package org.oca.chapter5.predicate;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerUse {
	
	public static void main(String[] args) {
		Stream<String> strings = Stream.of("Hello", "World");
		Consumer<String> printString = System.out::println;
		Consumer<String> printString2 = arg -> System.out.println("****************"+arg+"**************************");
		strings.forEach(printString.andThen(printString2));
	}
}