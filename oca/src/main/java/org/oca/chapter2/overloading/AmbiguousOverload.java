package org.oca.chapter2.overloading;

public class AmbiguousOverload {
	
	public static void aMethod(long val1, int val2){
		System.out.println("long, int");
	}
	
	public static void aMethod(int val2, long val1){
		System.out.println("int, long");
	}
	
	public static void main(String[] args) {
//		aMethod(9, 10);
	}

}
