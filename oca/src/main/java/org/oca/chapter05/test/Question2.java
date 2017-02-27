package org.oca.chapter05.test;

import java.util.function.Predicate;

public class Question2 {
	
	public static void main(String[] args) {
		Predicate<String> notNull = ((Predicate<String>)(x -> x == null)).negate();
		System.out.print(notNull.test(null));
	}

}
