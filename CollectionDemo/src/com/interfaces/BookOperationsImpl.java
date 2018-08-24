package com.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;

public class BookOperationsImpl  implements BookOperations, BookIO {

	List<Book> l = new ArrayList<Book>();
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		
		l.add(book);
		return 0;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		
		l.remove(book);
		return false;
	}

	@Override
	public Book BookfindById(Book book) {
		// TODO Auto-generated method stub
		Book b1= new Book();
		b1=null;
		for(Book b:l ) {
			if(b.getIsbn()==book.getIsbn()) {
				
			b1=b;
				
			}
					 
		else {
						
			}
			
		}
		return b1;
		

		
		
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		List<Book> l1 = new ArrayList<Book>();
		l1=null;
		for (Book b: l) {
			if(b.getName()== book_name) {
		
			l1.add(b);
				
			}
			else{
				
			//l1=null;
				}
			
		}return l1;
	}
	
	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner (System.in);
		System.out.println("enter isbn:-");
		int isbn= s.nextInt();
		System.out.println("enter name:-");
		String name= s.next();
		System.out.println("enter My publication:-");
		String publication= s.next();
		System.out.println("enter price:-");
		double price= s.nextDouble();
		Book b = new Book(isbn,name,publication,price);
		
		return b;
	}

	@Override
	public void printBook(List<Book> books) {
		// TODO Auto-generated method stub
		for(Book b:books) {
			printBook(b);
		}

	}

	@Override
	public void printBook(Book book) {
		// TODO Auto-generated method stub
      System.out.println(book.toString());
	}

}
