// example of constructor chaining
public class Employee {
	private int empId;
	private double salary;
	private String compName;
	private String empName;

	public Employee() {
		empId=10;
		empName="city";
		salary=1000;
		compName="city LTD";
	
	}
	public Employee(int empID, String empName, double salary) {
		this();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public void display() {
		System.out.println(empName+"\t"+empId+"\t"+compName);
	}
	public static void main(String[] args) { 
		Employee emp=new Employee (1200, "emp name1", 12000d);
		emp.display();
	}
}


