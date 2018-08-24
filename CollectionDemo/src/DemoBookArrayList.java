import java.util.ArrayList;
import java.util.List;

import com.beans.Book;


public class DemoBookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book(123, "Adv Java","Oracle",1234d));
		books.add(new Book(300, "Adv Java","Oracle",2000d));
		books.add(new Book(123, "Adv Java","Oracle",1234d));
	
		System.out.println("no.of books:-"+books.size());
		System.out.println(books);
		Book book_to_search = new Book(300, "Adv Java", "Oracle", 2000d);
		boolean remove = books.remove(book_to_search);
		System.out.println("removed:-"+remove);
		boolean found =books.contains(book_to_search);
		if(found) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
	}

}
