package org.oca.chapter05.predicate;

import java.util.function.Function;

public class FunctionApply {
	
	public static void main(String[] args) {
		Function<String, Integer> streLengh = arg -> arg.length();
		System.out.println(streLengh.apply("kfajnkfasnfasdas"));
	}

}
