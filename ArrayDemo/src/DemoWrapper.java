
public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Integer obj = new Integer(10);
		//Integer obj1 = new Integer("10");	
		int value= obj.intValue();
		int data = obj;
		System.out.println(data+"\t"+value);
		obj =200;
		System.out.println(obj+"\t"+value);
	}

}
