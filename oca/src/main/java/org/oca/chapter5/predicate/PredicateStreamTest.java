package org.oca.chapter5.predicate;

import java.util.stream.Stream;

public class PredicateStreamTest {
	
	public static void main(String[] args) {
		Stream	.of("Hello","World")
				.filter(x -> x.startsWith("H"))
				.forEach(System.out::println);
	}
}