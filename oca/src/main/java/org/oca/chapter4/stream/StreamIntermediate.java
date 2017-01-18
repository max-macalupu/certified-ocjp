package org.oca.chapter4.stream;

import java.util.stream.Stream;

public class StreamIntermediate {
	
	public static void main(String[] args) {
		
		System.out.println(Stream.of(1, 2, 3, 4, 5).count());
		System.out.println(Stream.of(1, 2, 3, 4, 5).map(i -> i * i ).count());
		System.out.println(Stream.of(1, 2, 3, 4, 5).map(i -> i * i ).peek( i -> System.out.printf("%d ", i)).count());
		
		Stream.of(1, 2, 3, 4, 5)
			.peek( i -> System.out.printf("%d ", i))
			.map(i -> i * i )
			.peek( i -> System.out.printf("%d ", i))
			.count();
		
	}
}