package org.oca.chapter02.number;

public class NumberSum {
	
	private static void sum(Number[] numbers){
		double sum = 0.0;
		for(Number number: numbers){
			sum += number.doubleValue();
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Number[] numbers = new Number[4];
		numbers[0] = new Byte((byte)10d);
		numbers[1] = new Float(10f);
		numbers[2] = new Integer(10);
		numbers[3] = new Double(10d);
		sum(numbers);
	}
}