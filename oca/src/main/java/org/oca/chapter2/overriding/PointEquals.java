package org.oca.chapter2.overriding;

public class PointEquals {
	
	private int xPos, yPos;

	public PointEquals(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		PointEquals other = (PointEquals)obj;
		if (xPos != other.xPos)
			return false;
		if (yPos != other.yPos)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		PointEquals point_1 = new PointEquals(10, 20);
		PointEquals point_2 = new PointEquals(10, 100);
		PointEquals point_3 = new PointEquals(10, 20);
		
		System.out.println("p1 equals p2: " + point_1.equals(point_2));
		System.out.println("p1 equals p3: " + point_1.equals(point_3));
		System.out.println("p3 equals p1: " + point_3.equals(point_1));
		
		
		Object o_point_1 = new PointEquals(10, 20);
		Object o_point_2 = new PointEquals(10, 100);
		Object o_point_3 = new PointEquals(10, 20);
		
		System.out.println("p1 equals p2: " + o_point_1.equals(o_point_2));
		System.out.println("p1 equals p3: " + o_point_1.equals(o_point_3));
		System.out.println("p3 equals p1: " + o_point_3.equals(o_point_1));
	}

}
