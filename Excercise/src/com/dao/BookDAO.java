package com.dao;

import java.util.List;

import com.beans.Book;

public interface BookDAO {
	public boolean addBook(Book book);
	public int updateBook(Book book, String ISBN);
	public int deleteBook();
	public Book findBookByISBN(String ISBN);
	public List<Book> findBooksByName(String name);
	public List<Book> findAllBooks();
	public List<Book> findBooksByAuthor(String auth_name);
	
	
	
	
}
