package org.oca.chapter04.generic;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest1 {
	
	public static void main(String[] args) {
		List list = new LinkedList();
		list.add("First");
		list.add("Second");
		
		List<String> strList = list;
//		strList.add(10);
		
		for(Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();)
			System.out.println(itemItr.next());
		
		List<String> list2 = new LinkedList<>();
		list2.add("First 2");
		list2.add("Second 2");
		
		List strList2 = list2;
//		strList2.add(10);
		for(Iterator<String> itemItr = strList2.iterator(); itemItr.hasNext();)
			System.out.println(itemItr.next());
	}

}
