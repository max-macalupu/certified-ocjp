package org.oca.chapter2.singleton;

public class LoggerHolder {
	
	private LoggerHolder(){		
	}
	
	public static class LoggerHolderStatic{
		public static LoggerHolder holder = new LoggerHolder();
	}
	
	public static LoggerHolder getInstance(){
		return LoggerHolderStatic.holder;
	}
	
	public void log(String data){
		System.out.println("Loggin...:" +data);
	}
}