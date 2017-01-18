package org.oca.chapter4.generic;

public class BoxPrinter<T> {
	
	private T value;

	public BoxPrinter(T value) {
		super();
		this.value = value;
	}

	@Override
	public String toString() {
		return "BoxPrinter [value=" + value + "]";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BoxPrinter<Integer> boxPrinter = new BoxPrinter<>(new Integer(10));
		BoxPrinter<String> boxPrinterString = new BoxPrinter<>("20");
		System.out.print(boxPrinter);
		System.out.print(boxPrinterString);
	}
}