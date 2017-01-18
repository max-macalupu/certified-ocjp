package org.oca.chapter3.interfaces;

public class Circle extends CircularShape{
	private int xPos, yPos, radius;
	public Circle(int xPos, int yPos, int radius) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
	}

	public void roll(float degree) {
		// TODO Auto-generated method stub
		System.out.println("Rolling object: " + degree);
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle [xPos=" + xPos + ", yPos=" + yPos + ", radius=" + radius + "]";
	}
}