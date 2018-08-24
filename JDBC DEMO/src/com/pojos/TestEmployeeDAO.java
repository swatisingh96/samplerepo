package com.pojos;

import java.util.Scanner;

import com.connections.EmployeeDAO;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int id= s.nextInt();
		String name =s.next();
		int salary= s.nextInt();
		
		Employee myEmployee= new Employee( id,salary,name);
		EmployeeDAO dao= new EmployeeDAO();
		int rows = dao.addEmployee(myEmployee);
		if(rows>0) {
			System.out.println("record inserted successfully");
		}
		else {
			System.out.println("sorry");
		}
	}

}
