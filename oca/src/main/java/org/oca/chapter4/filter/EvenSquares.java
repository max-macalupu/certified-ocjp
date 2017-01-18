package org.oca.chapter4.filter;

import java.util.stream.IntStream;

public class EvenSquares {
	
	public static void main(String[] args) {
		IntStream.rangeClosed(0, 100).map( i -> i * i).filter( i ->  i % 2 != 0).forEach(System.out::println);
		IntStream.rangeClosed(0, 100).filter( i ->  i % 2 != 0).map( i -> i * i).forEach(System.out::println);
		IntStream.rangeClosed(0, 100).filter( i ->  i % 2 != 0).map( i -> i * i).max();
	}
}