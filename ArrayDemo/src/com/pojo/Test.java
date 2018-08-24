package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter student name");
		String name = s.next();
		System.out.println("please enter no of marks you want to enter for student");
		int n = s.nextInt();
		int []marks =new int [n];
		
		for (int i =0; i<n;i++) {
			System.out.println("enter mark");
			marks[i]=s.nextInt();
		}

		System.out.println("please enter student rollNo");
		int rollNo = s.nextInt();
		
		Student student1= new Student(name, marks,rollNo);
		student1.display();
		
		
		
	}

}
