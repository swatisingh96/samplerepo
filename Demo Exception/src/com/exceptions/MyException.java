package com.exceptions;

public class MyException extends Exception {
	private String message;
	
	public MyException() {
		message="You got xxx exception";
	}
	
	public MyException(String message) {
		super();
		this.message = message;
	}
	
	public void showCause() {
		System.out.println("you got xxx exception");
	}
	
	public void printStackTrace() {
		super.printStackTrace();
		System.out.println("this is my message");
	}
}
