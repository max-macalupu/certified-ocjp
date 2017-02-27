package org.oca.chapter04.iterator;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	
	public static void main(String[] args) {
		Double[] data = {35.6, 40.5, 10.4, 13.58, 25.09, 34.16};
		List<Double> arrayData = Arrays.asList(data);
		System.out.println("List Before set: "+ arrayData);
		arrayData.set(0,  38.75);
		System.out.println("List After set: "+ arrayData);
	}
}