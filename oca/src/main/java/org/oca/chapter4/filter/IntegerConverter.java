package org.oca.chapter4.filter;

import java.util.Arrays;
import java.util.regex.Pattern;

public class IntegerConverter {
	
	public static void main(String[] args) {
		Object [] words = Pattern.compile(" ").splitAsStream("1 2 3 4 5").toArray();
		int finalSum = Arrays.stream(words).mapToInt(str -> Integer.valueOf(""+str)).sum();
		System.out.println(finalSum);
	}

}
