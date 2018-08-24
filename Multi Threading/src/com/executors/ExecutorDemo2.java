package com.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

 class MyApplication implements Callable<Integer> {
	private int data;
	public ExecutorDemo2(int i) {
		this.data=i;
		
	}
	int perform() {
		int sum=0;
		for(int i =0; i<data;i++) {
			sum =sum+i;
		}
		return sum;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello:----"+Thread.currentThread());
		return perform();
	}

}
 public class ExecutorDemo2{
	 public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(2);
		
		for(int i=12;i<15;i++) {
			Future<Integer> future =  exec.submit(new MyApplication(i)); 
			System.out.println("after calculation:-"+future.get());
		}
		exec.shutdown();
	}
 }
