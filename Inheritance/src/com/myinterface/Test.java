package com.myinterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

import com.pojo.Student;

public class Test implements StudentFileIO {

	@Override
	public Student[] readStudents() {
		// TODO Auto-generated method stub //deserializaton
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
	
		return null;
	}

	@Override
	public int writeStudents(Student[] students) {
		// TODO Auto-generated method stub //serialization
		return 0;
	}

	public static void main(String[] args) {
		Student[] students= new Student[5];
		
		Scanner s =new Scanner (System.in);
		for(int i=0; i<5;i++) {
			System.out.println("enter rollno");
			int rollNo=s.nextInt();
			System.out.println("enter total");
			int total=s.nextInt();
			students[i]= new Student(rollNo, total);
		}
		
		
	}
}
