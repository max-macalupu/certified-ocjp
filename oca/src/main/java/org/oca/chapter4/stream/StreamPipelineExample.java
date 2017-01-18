package org.oca.chapter4.stream;

import java.util.Arrays;
import java.util.Random;

public class StreamPipelineExample {
	
	public static void main(String[] args) {
		Arrays.stream(Object.class.getMethods())
					.map(method -> method.getName())
					.distinct()
					.forEach(System.out::println);		
		
		new Random().ints().limit(5).forEach(number -> System.out.println(number));;
	}
}