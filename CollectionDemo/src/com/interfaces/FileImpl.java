package com.interfaces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class FileImpl implements BookIO, BookOperations {

	
	public List<Book> readFromFile()
	{
		FileInputStream fi;
		List<Book> lr = new ArrayList<Book>();
		 
		try {
			fi = new FileInputStream("data.txt");
			ObjectInputStream o = new ObjectInputStream(fi);
			Object obj =o.readObject();
			List<Book> stu = (List<Book>)obj;
			lr=stu;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lr;
		
	}	@Override
	
	
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		File f = new File("abc.txt");
		if(f.isFile()) {
			List<Book> a = readFromFile();
			
			
		}
		
		return 0;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book BookfindById(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void printBook(List<Book> books) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printBook(Book book) {
		// TODO Auto-generated method stub

	}

}
