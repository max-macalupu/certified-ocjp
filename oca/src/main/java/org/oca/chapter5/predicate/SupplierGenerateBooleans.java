package org.oca.chapter5.predicate;

import java.util.Random;
import java.util.stream.Stream;

public class SupplierGenerateBooleans {
	
	public static void main(String[] args) {
		Random random = new Random();
		Stream.generate(random::nextBoolean)
					.limit(5)
					.forEach(System.out::println);
	}
}