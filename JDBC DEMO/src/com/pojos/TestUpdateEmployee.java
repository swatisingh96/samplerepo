package com.pojos;

import com.connections.EmployeeDAO;

public class TestUpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id_update=1;
		Employee emp = new Employee(0,8900,"citi");
		EmployeeDAO dao =new EmployeeDAO();
		Employee emp_updated = dao.updateEmployee(id_update, emp);
		System.out.println(emp_updated.getName()+":::"+emp_updated.getSalary());

	}

}
