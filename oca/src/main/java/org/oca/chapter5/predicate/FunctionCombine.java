package org.oca.chapter5.predicate;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionCombine {
	
	public static void main(String[] args) {
		
		Function<String, Integer> parseInt = Integer::parseInt;
		Function<Integer, Integer> integerAbs = Math::abs;
//		Function<String, Integer> parseAndAbs = parseInt.andThen(integerAbs);
		Function<String, Integer> parseAndAbs = integerAbs.compose(parseInt);	
		Arrays.stream("4, -9, 16".split(", ")).map(parseAndAbs).forEach(System.out::println);		
	}
}