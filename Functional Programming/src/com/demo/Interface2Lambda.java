package com.demo;

public class Interface2Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface2 m  = (p,p1) ->{return (p.getAge()==p1.getAge());};
		System.out.println(m.add(new Person(12,"swati"), new Person(13,"abc")));
		
	}

}
