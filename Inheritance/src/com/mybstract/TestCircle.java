package com.mybstract;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle(4,"circle");
		double a= s.area();
		System.out.println("area:-"+a);
		s.description();
	}

}
