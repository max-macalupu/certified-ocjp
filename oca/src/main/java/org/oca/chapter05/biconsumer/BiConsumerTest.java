package org.oca.chapter05.biconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {
	
	public static void main(String[] args) {
		
		BiConsumer<List<Integer>, Integer> listAddElement = List::add;
		List<Integer> listWithData = new ArrayList<>();
		listAddElement.accept(listWithData, 20);
		System.out.println(listWithData);
	}

}
