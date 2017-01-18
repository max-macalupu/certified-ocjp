package org.oca.chapter2.overloading;

public class Circle {
		
	public void fillColor(int a, int b, int c){
		
	}
	
	public void fillColor(float a, float b, float c){
		
	}
	
	public static void main(String[] args) {
		
		Circle circle_1 = new Circle();
		circle_1.fillColor(1, 2, 3);
		
		Circle circle_2 = new Circle();
		circle_2.fillColor(1f, 2f, 3f);
	}

}
