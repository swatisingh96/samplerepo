package com.data;

public class Supplier implements Runnable {
	
	private Message msg;
	public Supplier( Message  msg) {
		this.msg= msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stu
		String name = Thread.currentThread().getName();
		System.out.println(name+"started");
		try {
			Thread.sleep(1000);
			synchronized(msg) {
				msg.setMsg("hello from thread");
				msg.notify();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		

	}

}
