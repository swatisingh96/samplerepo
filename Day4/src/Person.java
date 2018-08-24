

public class Person {
	private int age;
	private String name;
	
	//access_sp return_type fun_name()
	public void display() {
		System.out.println("name:-"+name+"\t"+"age:-"+age);
	}
	public Person() {
		age=10;
		name="swati";
		
		
	}
	public Person(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public boolean equals(Object obj) {
		
		Person p = (Person) obj;
		return (p.name.equals(this.name) && p.age==this.age);
	}
	
	
}