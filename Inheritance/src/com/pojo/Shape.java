package com.pojo;

abstract public class Shape {
	String name;
	 public Shape() {
		name="no shape defined";
	}
	public Shape(String name) {
		this.name=name;
		
	}
	abstract public double area() ;

}
