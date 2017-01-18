package org.oca.chapter3.interfaces;

public abstract class Shape {
	abstract double area();
	private Shape parentShape;

	public Shape getParentShape() {
		return parentShape;
	}

	public void setParentShape(Shape parentShape) {
		this.parentShape = parentShape;
	}
}