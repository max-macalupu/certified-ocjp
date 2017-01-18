package org.oca.chapter2.singleton;

public class Logger {
	
	private static Logger instance;

	private Logger() {
	}
	
	public static Logger getInstance(){
		if(instance == null){
			instance = new Logger();
		}
		return instance;
	}
	
	public void log(String data){
		System.out.println("Loggin...:" +data);
	}

}