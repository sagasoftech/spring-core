package com.examples;

public class LazyInitDemo {

	private String message;
	private int count;
	
	public String getMessage() {
		return message;
	}
	
	public int getCount() {
		return count;
	}	

	public LazyInitDemo(String message) {
		this.message = message;
		System.out.println("LazyInitDemo1 I am getting called when requested !!");
	}
	
	public LazyInitDemo(int count) {
		this.count = count;
		System.out.println("LazyInitDemo2 I am getting called when Beans.xml loaded by ApplicationContext !!");
	}
	
}
