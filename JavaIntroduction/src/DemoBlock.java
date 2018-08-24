
public class DemoBlock {
	public DemoBlock() {
		System.out.println("constructor invoked");
		
	}
	
	{
		System.out.println("non static block invoked");
	}
	
	static {
		System.out.println("static block invoked");
	}
	public void display() {
		System.out.println("display invoked");
		
	}
	
	public static void main (String[]args) {
	DemoBlock d = new DemoBlock();
	DemoBlock d1 = new DemoBlock();
	d.display();
	}
}
