package org.oca.chapter4.generic;

import java.util.List;

public class Utilities {
	
	public static <T> void fillList(List<T> list, T value){
		for(int i=0; i<list.size(); i++){
			list.set(i, value);
		}
	}
}