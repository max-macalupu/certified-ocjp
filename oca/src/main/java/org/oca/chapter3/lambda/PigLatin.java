package org.oca.chapter3.lambda;

public class PigLatin {
	
	public static void main(String[] args) {
		final String word = "hello";
		SuffixFunction suffixFunction = () -> System.out.println(word + "ay");
//		word = "e";
		suffixFunction.call();
	}

}
