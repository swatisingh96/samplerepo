package com.pojo;

import java.util.Scanner;



public class TestShape {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the type of shape");
		String name= s.next();
		Shape shape;
		if(name=="circle") {
			System.out.println("enter radius");
			int radius = s.nextInt();
			shape= new Circle(radius);
			
		}
		if(name=="rectangle") {
			System.out.println("enter length");
			int length = s.nextInt();
			System.out.println("enter width");
			int width = s.nextInt();
			shape = new Rectangle(length, width);
		}
		//Shape shape = new Shape(name);
		// TODO Auto-generated method stub

	}

}
