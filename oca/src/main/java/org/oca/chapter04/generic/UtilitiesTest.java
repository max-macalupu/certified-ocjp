package org.oca.chapter04.generic;

import java.util.ArrayList;
import java.util.List;

public class UtilitiesTest {
	
	public static void main(String[] args) {
		List<Integer> listData = new ArrayList<>();
		listData.add(10);
		listData.add(20);
		System.out.println("Original List: "+listData);
		Utilities.fillList(listData, 100);
		System.out.println("Final List: "+listData);
	}

}
