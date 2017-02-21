package org.oca.chapter5.primitive;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamIntegerFunction {
	
	public static void main(String[] args) {
		AtomicInteger integer = new AtomicInteger(0);
		
		/**Create stream since function*/
		Stream.generate(integer::getAndIncrement).limit(10).forEach(System.out::print);
	}

}
