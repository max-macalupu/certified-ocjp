package org.oca.chapter4.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class SplQueue {
	
	private Deque<String> spl = new ArrayDeque<>();
	
	public void addInQueue(String customer){
		spl.addLast(customer);
	}
	
	public void removeInFront(){
		spl.removeFirst();
	}
	
	public void removeInBack(){
		spl.removeLast();
	}
	
	public void printSpl(){
		System.out.println(spl);
	}

}
