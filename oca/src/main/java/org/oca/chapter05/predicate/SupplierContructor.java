package org.oca.chapter05.predicate;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierContructor {
	
	public static void main(String[] args) {
	
		Supplier<String> newString = String::new;
		System.out.println(newString.get());
		
		Supplier<String> newStringOther = () -> new String();
		System.out.println(newStringOther.get());
		
		Function<String, Integer> function = Integer::valueOf;
		System.out.println(function.apply("25"));
	}
}