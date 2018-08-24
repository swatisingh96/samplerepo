package com.pojo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSerialiation {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("student.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Object obj =oi.readObject();
			Student stu = (Student)obj;
			System.out.println(stu.getRollNo()+"\t"+stu.getTotal());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}	
}
