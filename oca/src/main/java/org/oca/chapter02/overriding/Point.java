package org.oca.chapter02.overriding;

public class Point {
	
	private int xPos, yPos;

	public Point(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	@Override
	public String toString() {
		return "Point [xPos=" + xPos + ", yPos=" + yPos + "]";
	}

	public static void main(String[] args) {
		System.out.println(new Point(4,50));
	}
}