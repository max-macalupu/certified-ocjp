package org.oca.chapter05.bifunction;

import java.util.function.BiFunction;

public class BiFunctionTest {
	
	public static void main(String[] args) {
		BiFunction<Double, Double, Integer> compareDoubles = Double::compare;
		
		System.out.println(compareDoubles.apply(20.0, 12.0));
	}

}
