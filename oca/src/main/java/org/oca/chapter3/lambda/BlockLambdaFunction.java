package org.oca.chapter3.lambda;

public class BlockLambdaFunction {
	
	private String showLambdaFunction(int x_par){
		BlockLambda lambdaFunction = (int x) -> {
			if (x%2 == 0) return "even";
			else return "odd" ;
		};
		return lambdaFunction.intKind(x_par);
	}
	
	public static void main(String[] args) {
		System.out.println(new BlockLambdaFunction().showLambdaFunction(10));
	}

}
