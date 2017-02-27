package org.oca.chapter04.stream;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {
	
	public void printUpperCaseString(String string){
		System.out.println(string.toUpperCase());
	}
	
	public void printUpperCaseString(String string, Double data){
		System.out.println(string.toUpperCase()+" "+data);
	}
	
	public static void main(String[] args) {	
		List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
		MethodReferences object = new MethodReferences();
		strings.forEach(object::printUpperCaseString);
	}
}