package org.oca.chapter03.nested;

public class TestShape {
	
	public static void main(String[] args) {
		Shape.Color m0_color = new Shape.Color(255, 255, 255);
		System.out.println(m0_color);
		
		Shape.Color m1_color = new Shape.Color(100, 100, 100);
		System.out.println(m1_color);
		System.out.println(m0_color);
	}

}
