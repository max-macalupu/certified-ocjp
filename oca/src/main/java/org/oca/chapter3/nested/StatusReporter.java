package org.oca.chapter3.nested;

public class StatusReporter {
	
	static Shape.Color getDescriptiveColor(final Shape.Color color){
		class DescriptiveColor extends Shape.Color{
			public String toString(){
				return "You selected a color with this values "+color;
			}
		}
		return new DescriptiveColor();
	}
	
	static Shape.Color getAnonymusDescriptiveColor(final Shape.Color color){
		return new Shape.Color(){
			public String toString(){
				return "You selected a color with this anonymus values "+color;
			}
		};
	}
}