package org.oca.chapter5.predicate;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionIdentity {
	
	public static void main(String[] args) {
		Arrays.stream("4, -9, 16".split(", ")).map(Function.identity()).forEach(System.out::println);
	}

}
