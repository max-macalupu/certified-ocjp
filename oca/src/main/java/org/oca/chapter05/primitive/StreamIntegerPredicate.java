package org.oca.chapter05.primitive;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class StreamIntegerPredicate {
	
	public static void main(String[] args) {
		
		/**Indirect predicate*/
		IntStream.range(1, 10).filter(i -> i%2 == 0).forEach(System.out::println);

		/**With predicate*/
		IntPredicate intPredicate = i -> i%2 == 0;
		IntStream.range(1, 10).filter(intPredicate).forEach(System.out::println);
		
	}
}