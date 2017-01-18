package org.oca.chapter3.interfacedaemon;

public class Diamond implements Interface1, Interface2{

	@Override
	public void food() {
		// TODO Auto-generated method stub
		Interface2.super.food();
	}
	
	public static void main(String[] args) {
		new Diamond().food();
	}

}
