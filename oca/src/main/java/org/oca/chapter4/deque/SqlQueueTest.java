package org.oca.chapter4.deque;

public class SqlQueueTest {

	public static void main(String[] args) {
		SplQueue queue = new SplQueue();
		queue.addInQueue("Roxana");
		queue.addInQueue("Maria");
		queue.addInQueue("Antonia");
		queue.addInQueue("Yannina");
		
		queue.printSpl();
		queue.removeInFront();
		queue.removeInBack();
		queue.printSpl();
	}
	
}
