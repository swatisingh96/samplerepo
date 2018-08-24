package com.pojo;

public class Circle extends Shape {

	int radius;
	
	public Circle() {
		radius=10;
	}
	public Circle(int radius) {
		this.radius=radius;
	}
	@Override
	public double area() {
		double a = 3.14*radius*radius;
		
		
		// TODO Auto-generated method stub
		return a;
	}

}
