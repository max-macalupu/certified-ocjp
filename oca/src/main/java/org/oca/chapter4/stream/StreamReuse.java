package org.oca.chapter4.stream;

import java.util.stream.IntStream;

public class StreamReuse {
	
	public static void main(String[] args) {
		
		IntStream chars = "bookkeep".chars();
//		System.out.println(chars.count());
		chars.distinct().sorted().forEach( ch -> System.out.printf("%c ", ch));
//		chars.sorted().forEach( ch -> System.out.printf("%c ", ch));
		
	}

}
