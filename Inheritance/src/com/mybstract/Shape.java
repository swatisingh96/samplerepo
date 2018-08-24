package com.mybstract;

abstract public class Shape {
	
	private String name;
	public Shape() {
		name="no name";
		
	}
	
	public Shape(String name) {
		this.name=name;
	
	}
	public void description() {
		System.out.println("name:-"+name);
	}
	abstract public double area();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
