package com.data;

public class Consumer implements Runnable {
	private Message msg;
	public Consumer( Message  msg) {
		this.msg= msg;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stu
			String name = Thread.currentThread().getName();
			synchronized(msg) {
				try { 
				System.out.println(name+"waiting to get notified at time:"+System.currentTimeMillis());
				
				msg.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
				
			}
				System.out.println(name+"consumer thread got notified at time"+System.currentTimeMillis());
				System.out.println(name+"processed:"+msg.getMsg());
			}
			

		}


	}


