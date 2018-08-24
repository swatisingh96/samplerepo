package com.beans;

import java.util.Set;
import java.util.TreeSet;

import com.compare.MyComparator;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stube
		Set<Book> books= new TreeSet<>(new MyComparator());
		books.add(new Book());
		books.add(new Book(123, "Adv Java","Oracle",1234d));
		books.add(new Book(300, " Java 8","Oracle",2000d));
		books.add(new Book(12, "Spring","Oracle",167d));
		System.out.println("size:-"+books.size());
		System.out.println(books);
		
		
	}

	
}
