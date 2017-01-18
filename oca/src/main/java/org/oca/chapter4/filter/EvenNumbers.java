package org.oca.chapter4.filter;

import java.util.stream.IntStream;

public class EvenNumbers {
	
	public static boolean isEven(int i){
		return i % 2 == 0;
	}
	
	public static void main(String[] args) {
		
		IntStream.rangeClosed(0, 10).filter(i -> (i % 2) == 0).forEach(System.out::println);
		IntStream.rangeClosed(0, 10).filter(EvenNumbers::isEven).forEach(System.out::println);
		
	}
}