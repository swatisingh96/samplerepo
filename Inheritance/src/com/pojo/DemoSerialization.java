package com.pojo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s =new Student(12, 300);
	
		try {
			FileOutputStream fo = new FileOutputStream("student.txt");
			ObjectOutputStream oo= new ObjectOutputStream(fo);
			oo.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
