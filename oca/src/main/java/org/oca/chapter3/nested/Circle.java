package org.oca.chapter3.nested;

public class Circle {
	
	class Point{
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
	}
	
	private Point center;
	private int radius;
	public Circle(int xPos, int yPos, int radius) {
		super();
		center = this.new Point(xPos, yPos);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [point=" + center + ", radius=" + radius + "]";
	}
}