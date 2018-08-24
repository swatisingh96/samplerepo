
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;
public class DemoHashMapBook {
		
		public static void main(String[] args) {
			Map<String, Book> m  = new HashMap();
			m.put("citi", new Book(12,"java","abc",1200d));
			m.put("wipro",  new Book(13,"java1","abc",1255d));
			m.put("Accenture",  new Book(14,"java2","abc",1244d));
			
			//System.out.println(m);
			m.put("citi",  new Book(15,"java3","abc",1234d));
		//	System.out.println(m);
			
			Set<Entry<String, Book>> entries= m.entrySet();
			Iterator<Entry<String, Book>> iterator = entries.iterator();
			while(iterator.hasNext()) {
				Entry<String,Book> entry = iterator.next();
				System.out.println(entry.getKey()+"::"+entry.toString());
			}
		}
		

	}



