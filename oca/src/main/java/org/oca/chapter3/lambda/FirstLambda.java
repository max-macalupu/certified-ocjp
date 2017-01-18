package org.oca.chapter3.lambda;

public class FirstLambda {
	
	public static void main(String[] args) {
		LambdaFunction lambdaFunction = (int x) -> System.out.println("Hello Lambda world: " + x*x);
		lambdaFunction.call(4);
	}
}