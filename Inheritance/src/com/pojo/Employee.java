package com.pojo;

public class Employee extends Person {
	private double empSalary;
	private int empID;
	
	public Employee() {
		//super();
		empSalary=1000;
		empID=0;
	}
	
	
	public Employee(int empID, double empSalary, int age, String name) {
		super(age,name);
		this.empID= empID;
		this.empSalary= empSalary;
		
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public void show() {
		display();
		System.out.println(empID+"\t"+empSalary);
		//System.out.println(+empID+"name");
	}
	public void display(int x) {
		super.display();
		System.out.println(empID+"\t"+empSalary);
	}
	public String toString() {
		return super.toString()+ empID+" "+empSalary;
	}
public boolean equals(Object obj) {
		
		Employee e = (Employee) obj;
		return e.empID == (this.empID) && e.empSalary==this.empSalary && super.equals(e);
	}
}
