package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class BookFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book(123, "Adv Java","Oracle",1234d));
		books.add(new Book(300, "Adv Java1","Oracle",2000d));
		books.add(new Book(123, "Adv Java","Oracle",1234d));
		
		books.stream().filter( data -> {return data.getName().endsWith("Java") ;}).collect(Collectors.toList()).forEach(System.out::println);
	

	}

}
