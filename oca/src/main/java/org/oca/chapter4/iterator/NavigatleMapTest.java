package org.oca.chapter4.iterator;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigatleMapTest {
	
	public static void main(String[] args) {
		
		NavigableMap<Integer, String> navigableMap = new TreeMap<>();
		navigableMap.put(10, "Andrea");
		navigableMap.put(40, "Fabiola");
		navigableMap.put(65, "Sussana");
		navigableMap.put(35, "Mario");
		navigableMap.put(75, "Rosario");
		navigableMap.put(55, "Roxana");
		
		System.out.println("Ascendente Map: "+ navigableMap);
		System.out.println("Descendente Map: "+ navigableMap.descendingMap());
		System.out.println("Mayor a 40: "+ navigableMap.tailMap(40));
		System.out.println("Menor Puntaje: "+ navigableMap.firstEntry());
		System.out.println("Mayor Puntaje: "+ navigableMap.lastEntry());
	}

}
