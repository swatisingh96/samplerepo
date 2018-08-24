package com.pojos;

import java.util.List;

import com.connections.EmployeeDAO;

public class TestFindEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAO dao= new EmployeeDAO();
		List<Employee> emps = dao.finAllEmployees();
		for(Employee e:emps) {
			System.out.println("id:"+e.getEmpId()+" "+"name:"+e.getName()+" "+"salary:"+e.getSalary());
		}

	}

}
