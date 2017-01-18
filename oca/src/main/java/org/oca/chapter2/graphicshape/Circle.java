package org.oca.chapter2.graphicshape;

public class Circle extends Shape{
	
	private int radius;

	public void paint(){
		System.out.print("Area: "+3.14 * radius * radius);
	}
	
	void fillColor(){
		System.out.print("Color: "+color);
	}
}