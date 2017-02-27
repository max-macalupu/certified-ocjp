package org.oca.chapter04.generic;

public class PairClass<T1,T2> {
	
	private T1 firstData;
	private T2 secondData;
	
	public PairClass(T1 firstData, T2 secondData) {
		super();
		this.firstData = firstData;
		this.secondData = secondData;
	}

	public T1 getFirstData() {
		return firstData;
	}

	public T2 getSecondData() {
		return secondData;
	}
	
	public static void main(String[] args) {
		PairClass<Integer, String> cup_001 = new PairClass<>(new Integer(2014), "Brazil");
		PairClass<Integer, String> cup_002 = new PairClass<>(new Integer(2010), "Italia");
		
		System.out.print(cup_001.getSecondData()+" Win the cup in: "+cup_001.getFirstData());
		System.out.print(cup_002.getSecondData()+" Win the cup in: "+cup_002.getFirstData());
	}
}