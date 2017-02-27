package org.oca.chapter03.enums;

public enum PrinterType {
//	private int pagePrintCapacity; DON'T HERE FIRST
	DOTMATRIX(5), INKJET(10), LASER(50);
	private int pagePrintCapacity;
	
	private PrinterType(int pagePrintCapacity) {
		this.pagePrintCapacity = pagePrintCapacity;
	}

	public int getPrintPageCapacity() {
		return pagePrintCapacity;
	}
}