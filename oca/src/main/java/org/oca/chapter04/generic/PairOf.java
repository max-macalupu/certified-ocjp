package org.oca.chapter04.generic;

public class PairOf<T> {
	
	private T object01;
	private T object02;
	
	public PairOf(T object01, T object02) {
		super();
		this.object01 = object01;
		this.object02 = object02;
	}

	public T getObject01() {
		return object01;
	}

	public T getObject02() {
		return object02;
	}
	
	public static void main(String[] args) {
		PairOf<String> cup_001 = new PairOf("2010", "Italia");
		PairOf<String> cup_002 = new PairOf<>("2014", "Alimania");
		
		System.out.print(cup_001.getObject02()+" Win the cup in: "+cup_001.getObject01());
		System.out.print(cup_002.getObject02()+" Win the cup in: "+cup_002.getObject01());
	}
}