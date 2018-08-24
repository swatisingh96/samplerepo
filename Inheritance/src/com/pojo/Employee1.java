package com.pojo;

import java.util.Scanner;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*Scanner s= new Scanner(System.in);
		System.out.println("enter name");
		String name= s.next();
		System.out.println("enter empID");
		int empID= s.nextInt();
		System.out.println("enter emp Salary");
		double empSalary= s.nextDouble();
		System.out.println("enter age");
		int age= s.nextInt();

		Employee emp = new Employee(empID, empSalary,age, name);
		//emp.show();
		System.out.println(emp);
		*/
		Employee e =new Employee(12,20,12,"abc");
		Employee e1=new Employee(12,200,12,"abc");
		if(e.equals(e1)) {
			
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
	}

}
