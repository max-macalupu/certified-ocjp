package org.oca.chapter2.covariant;

public class Circle extends Shape{
	
	private int xPos, yPos;
	public Circle(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}

	@Override
	public Circle copy() {
		// TODO Auto-generated method stub
		return this;
	}
	
	public static void main(String[] args) {
		Circle circle_1 = new Circle(1,4);
		Circle circle_2 = circle_1.copy();
	}

}
