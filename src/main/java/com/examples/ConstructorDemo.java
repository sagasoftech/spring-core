package com.examples;

public class ConstructorDemo {

	private String message;
	private int count;
	
	public String getMessage() {
		return message;
	}
	
	public int getCount() {
		return count;
	}	
	
	public ConstructorDemo(String message) {
		super();
		this.message = message;
	}
	
	public ConstructorDemo(String message, int count) {
		super();
		this.message = message;
		this.count = count;
	}

}
