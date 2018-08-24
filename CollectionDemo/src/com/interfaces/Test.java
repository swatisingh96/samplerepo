package com.interfaces;


import com.beans.Book;

public class Test {
	public static void main(String[] args) {
		 int count=5;
		 BookOperationsImpl b1 =new BookOperationsImpl();
		BookOperationsImpl b2 =new BookOperationsImpl();
		BookOperationsImpl b3 =new BookOperationsImpl();
		for(int i=0; i<count;i++ ) {
		
		Book b =b1.getBook();
		System.out.println(b2.addBook(b));
		
		}
		Book b4= new Book(12,"Java adv","publication",2000d);
	
		b2.BookfindById(b4);
		
	}

}
