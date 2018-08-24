import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.beans.Book;

public class DemoHashMapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<Book>> m = new HashMap();
		List<Book> books_java = new ArrayList<Book>();
		books_java.add(new Book(12, "java1", "abc", 1200d));
		books_java.add(new Book(13, "java2", "abc", 1200d));
		books_java.add(new Book(14, "java3", "abc", 1200d));
		m.put("JAVA", books_java);
		
		List<Book> books_dotNet = new ArrayList<Book>();
		books_dotNet.add(new Book(15, "DotNet1", "abc", 1200d));
		books_dotNet.add(new Book(16, "DotNet2", "abc", 1200d));
		books_dotNet.add(new Book(17, "DotNet3", "abc", 1200d));
		m.put("DOT NET", books_dotNet);
		
		List<Book> books_ETL = new ArrayList<Book>();
		books_ETL.add(new Book(18, "ETL1", "abc", 1200d));
		books_ETL.add(new Book(19, "ETL2", "abc", 1200d));
		books_ETL.add(new Book(20, "ETL3", "abc", 1200d));
		m.put("ETL", books_ETL);
		Set<Entry<String, List<Book>>> entries = m.entrySet();
		Iterator<Entry<String, List<Book>>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			Entry<String, List<Book>> entry = iterator.next();
			System.out.println(entry.getKey() + ":");
			for (Book b : entry.getValue()) {
				System.out.println(b);
			}
		}
	}

}
