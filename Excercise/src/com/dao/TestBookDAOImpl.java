package com.dao;

import java.util.Scanner;

import com.beans.Book;

public class TestBookDAOImpl {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	/*	System.out.println("enter isbn");
		String isbn=s.next();
		System.out.println("enter name");
		String name=s.next();
		System.out.println("enter publication");
		String publication = s.next();
		System.out.println("enter author");
		String author = s.next();
		
		BookDAOImpl bookdao = new BookDAOImpl();
		Book b1 = new Book(isbn, name, publication, author);
		boolean val= bookdao.addBook(b1);
		if(val==true) {
			System.out.println("book added");
		}
		else
		{
			System.out.println("couldn't add the book");
		}
		
		System.out.println("enter book data to replace by isbn");
		System.out.println("enter isbn");
		String isbn1=s.next();
		System.out.println("enter name");
		String name1=s.next();
		System.out.println("enter publication");
		String publication1 = s.next();
		System.out.println("enter author");
		String author1 = s.next();
		
		BookDAOImpl bookdao = new BookDAOImpl();
		Book b2 = new Book(isbn1,name1,publication1,author1);
		bookdao.updateBook(b2, isbn1);
	*/
		
		BookDAOImpl bookdao = new BookDAOImpl();
		Book b = new Book();
		b= bookdao.findBookByISBN("isbn3");
	
		
		
		
	}

}
