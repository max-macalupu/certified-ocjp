package org.oca.chapter03.nested;

public class TestStatusReporter {
	
	public static void main(String[] args) {
		Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(0,0,0));
		System.out.println(descriptiveColor);
	}

}
