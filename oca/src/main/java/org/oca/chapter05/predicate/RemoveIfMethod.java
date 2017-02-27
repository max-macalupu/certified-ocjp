package org.oca.chapter05.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfMethod {
	
	public static void main(String[] args) {
		
		Predicate<String> startWith_H = (arg -> arg.startsWith("h"));
		List<String> greeting = new ArrayList<>();
		greeting.add("hello");
		greeting.add("world");
//		greeting.removeIf(str -> !str.startsWith("h"));
		greeting.removeIf(startWith_H.negate());		
		greeting.forEach(System.out::println);
	}
}