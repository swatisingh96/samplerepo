package com.pojo;

public class Rectangle extends Shape {

	@Override

	int length,width;
	
	public Rectangle() {
		length=10;
		width=5;
	}
	public Rectangle(int length, int width) {
		this.length=length;
		this.width=width;
	}
	@Override
	public double area() {
		double a = length*width;
		
		
		// TODO Auto-generated method stub
		return a;

}
