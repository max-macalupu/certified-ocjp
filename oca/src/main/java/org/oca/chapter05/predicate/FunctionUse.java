package org.oca.chapter05.predicate;

import java.util.Arrays;

public class FunctionUse {
	
	public static void main(String[] args) {
		Arrays.stream("4, -9, 16".split(", ")).map(Integer::parseInt).map(x -> x < 0 ? x : x * -1).forEach(System.out::println);
	}

}
