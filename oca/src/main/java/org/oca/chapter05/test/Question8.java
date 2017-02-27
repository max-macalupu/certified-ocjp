package org.oca.chapter05.test;

import java.util.function.ObjIntConsumer;

public class Question8 {

	public static void main(String[] args) {
		ObjIntConsumer<String> charAt = (str, i) -> str.charAt(i); // #1
//		System.out.println(charAt.accept("java", 2)); // #2
	}

}