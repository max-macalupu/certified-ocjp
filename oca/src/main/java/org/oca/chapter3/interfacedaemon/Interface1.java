package org.oca.chapter3.interfacedaemon;

public interface Interface1 {

	
	default public void food(){
		System.out.println("Interface1's 1 foo");
	}
	
	public static void run(){
		
	}
	
}
