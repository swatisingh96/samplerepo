package com.data;

public class TestMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		Message msg = new Message("process it");
		Consumer waiter =  new Consumer(msg);
		new Thread(waiter, "Consumer 1").start();
		
		
		Supplier waiter1= new Supplier(msg);
		new Thread(waiter1, "supplier1").start();
		
		System.out.println("all the threads are started");

	}

}
