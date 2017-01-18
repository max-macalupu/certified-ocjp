package org.oca.chapter3.abstracts;

public abstract class Shape {
	
	public abstract double area();
	
	final public void setParentShape(Shape shape){
		
	}
	
	public Shape getParentShape(){
		return this;
	}
}