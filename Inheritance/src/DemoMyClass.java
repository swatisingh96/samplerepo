import java.util.Scanner;

import com.pojo.Employee;
import com.pojo.EmployeeIOempl;

public class DemoMyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeIOempl e= new EmployeeIOempl() {
			
			
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				System.out.println("enter name");
				String name= s.next();
				System.out.println("enter empID");
				int empID= s.nextInt();
				System.out.println("enter emp Salary");
				double empSalary= s.nextDouble();
				System.out.println("enter age");
				int age= s.nextInt();
				Employee emp = new Employee(empID, empSalary,age, name);
				return emp;
				
				
			}
				
				public void writeEmployee(Employee employee) {
					// TODO Auto-generated method stub
					System.out.println("empID:-"+employee.getEmpID());
					System.out.println("name:-"+employee.getName());
					System.out.println("empSalary:-"+employee.getEmpSalary());
					System.out.println("age:-"+employee.getAge());
				}
		 };
		 
		 e.writeEmployee(e.readEmployee());
	}
	
	

}
