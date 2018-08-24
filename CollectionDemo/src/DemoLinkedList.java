import java.util.LinkedList;
import java.util.List;

import com.beans.Book;

public class DemoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new LinkedList();
		books.add(new Book());
		books.add(new Book(123, "Adv Java","Oracle",1234d));
		books.add(new Book(300, "Adv Java","Oracle",2000d));
		books.add(new Book(123, "Adv Java","Oracle",1234d));
		System.out.println(books);
		
	}

}
