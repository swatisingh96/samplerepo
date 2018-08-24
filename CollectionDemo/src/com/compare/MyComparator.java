package com.compare;
import java.util.Comparator;

import com.beans.Book;

public class MyComparator implements Comparator<Book> {
	
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return ((int)(o1.getPrice()-o2.getPrice()));
	}

/*	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
	

	

	
}
