package com.demo;

public class DemoInnerClass {
	
	public static void main(String[] args) {
		MyInterface m = new MyInterface() {
			
			@Override
			public void showData() {
				// TODO Auto-generated method stub
				System.out.println("displaying data from inner class");
			}
		};
		
		m.showData();
	}

}
