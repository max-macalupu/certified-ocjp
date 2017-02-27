package org.oca.chapter05.predicate;

import java.util.function.Consumer;

public class ConsumerString {
	
	public static void main(String[] args) {
		Consumer<String> printUpperCase = arg -> System.out.println(arg);
		
		printUpperCase.accept("Tela");
	}

}
