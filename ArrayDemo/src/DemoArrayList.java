import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(new Integer(234));
		list.add(20);
		list.add(10);
		list.add(20);
		
		System.out.println(list.size()+"\t"+list);
		
		list.add(2,200);
		
		System.out.println(list.size()+"\t"+list);
		
		list.remove(new Integer(10));
		System.out.println(list.size()+"\t"+list);
	}

}
