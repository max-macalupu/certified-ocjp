package org.oca.chapter3.abstracts;

public class Rectangle extends Shape{
	
	private int lenght, height;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lenght * height;
	}
	
	@Override
	public Shape getParentShape() {
		// TODO Auto-generated method stub
		return super.getParentShape();
	}	
}