package org.oca.chapter05.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateTest {
	
	public static void main(String[] args) {
		
		
		BiPredicate<List<Integer>, Integer> biPredicate = List::contains;
		
		List<Integer> listData = Arrays.asList(10,5,3);
		
		System.out.println(biPredicate.test(listData, 5));
		
	}

}
