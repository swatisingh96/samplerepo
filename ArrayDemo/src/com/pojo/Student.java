package com.pojo;

public class Student {

	String name;
	int [] marks;
	int rollNo;
	
	public Student() {
		name = "swati";
		marks=new int[] {100 , 200};
		rollNo= 14743;
	}
	public Student(String name, int[] marks, int rollNo ){
		this.name=name;
		this.marks=marks;
		this.rollNo=rollNo;
		
		
	}
	 
	
	public void display() {
		System.out.println("name:-"+name+"\t");
		for(int num :marks) {
		System.out.println("marks:-"+num+"\t");
		}
		System.out.println("rollNo:-"+rollNo);
				
	}
}
