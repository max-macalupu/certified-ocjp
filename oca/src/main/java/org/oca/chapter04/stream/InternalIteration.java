package org.oca.chapter04.stream;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		strings.forEach(data -> System.out.println(data));
		strings.forEach(System.out::println);
	}

}
