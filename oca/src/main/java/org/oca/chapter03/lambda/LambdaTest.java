package org.oca.chapter03.lambda;

public class LambdaTest {
	
	interface DoNothing{
		default void doNothing(){ System.out.println("DoNothing");}
//		void doNothing();
	}
	
	@FunctionalInterface
	interface DontDoAnyThing extends DoNothing{
//		void test();
		@Override
		void doNothing();
	}
	
	public static void main(String[] args) {
		DontDoAnyThing doAnyThing = () -> System.out.println("be Idle");
		doAnyThing.doNothing();
//		doAnyThing.test();
	}

}
