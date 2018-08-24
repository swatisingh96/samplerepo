package com.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myapp implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		perform();
			}
	 void perform() {
		 for(int i =0; i<5;i++) {
			 System.out.println("hello\t"+i+ "\t"+ Thread.currentThread());
			 try {
				 Thread.sleep(100);
			 }catch(InterruptedException ie){
				 System.out.println(ie);
			 }
		 }
	 }
}
	 public class ExecutorDemo1{
		 public static void main(String[] args) {
			ExecutorService exec = Executors.newSingleThreadExecutor();
			for(int i=0; i<3;i++) {
				exec.execute(new myapp());
				
			}
				System.out.println("after submitting tasks");
				System.out.println();
			
		}
	 }

