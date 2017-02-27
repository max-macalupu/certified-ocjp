package org.oca.chapter04.generic;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {
	
	static void printList(List<?> list){
//		list.add(new Integer(20));
		for(Object data: list)
			System.out.println(data);		
	}
	
	public static void main(String[] args) {
		
		List<Integer> listData = new ArrayList<>();
		listData.add(10);
		listData.add(20);
		printList(listData);
		
		List<String> listDataStre = new ArrayList<>();
		listDataStre.add("10");
		listDataStre.add("20");
		printList(listDataStre);
	}
}