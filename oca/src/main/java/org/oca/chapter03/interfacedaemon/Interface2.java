package org.oca.chapter03.interfacedaemon;

public interface Interface2 {

	default public void food(){
		System.out.println("Interface1's 2 foo");
	}
	
}
