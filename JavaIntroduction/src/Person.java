
public class Person {
	private int age;
	private String name;
	
	//access_sp return_type fun_name()
	public void display() {
		System.out.println("name:-"+name+"\t"+"age:-"+age);
	}
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
}