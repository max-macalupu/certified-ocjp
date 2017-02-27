package org.oca.chapter04.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();		
		for(int i=0; i<10; i++){
			arrayList.add(i);
		}
		System.out.println("List Before remove: "+arrayList);
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()){
			iterator.next();
			iterator.remove();
		}		
		System.out.println("List After remove: "+arrayList);
	}

}
