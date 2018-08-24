import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList();
		l.add("abc");
		l.add("123");
		l.add("xyz");
		l.add("AM");
		l.add("xyz");
	/*    l.add(new Double(12.365d));
		l.add(new Object());
		l.add(new File("add.txt"));
		System.out.println(l);
		System.out.println("earlier size"+l.size());
		
		l.add(2, "New Data");
		
		System.out.println(l);
		boolean a =l.contains("12");
		if(a) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		Object o=l.get(2);
		System.out.println("your data is:-"+o);
	//	l.size();
	 
	*/	Object o;
		boolean removed =l.remove("123");
		if(removed) {
			System.out.println("removed 123");
		}
		else {
			System.out.println("not rem");
		}
		o = l.remove(0); 
		System.out.println("you removed:-"+o);
		System.out.println("new size:-"+l.size());

	
	
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String data=it.next();
			System.out.println(data);
		}
	
}
}
