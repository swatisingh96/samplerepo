
public class Demo1DObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] persons;
		persons = new Person[5];
		persons[0]= new Person(12, "a");
		persons[1]= new Person(12, "b");
		persons[2]= new Person(12, "c");
		persons[3]= new Person(12, "d");
		persons[4]= new Person(12, "e");
		for(Person x: persons) {
			x.display();
		}
	}

}
