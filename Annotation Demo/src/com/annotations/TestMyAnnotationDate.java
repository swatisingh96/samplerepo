package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestMyAnnotationDate {

	@MyAnnotationDate(day=13,month="August",year= 2018)
	public static void display() {
		System.out.println("display");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method st
		TestMyAnnotationDate test = new TestMyAnnotationDate();
		Class class1 = test.getClass();
		
		Method[] methods= class1.getMethods();
		for(Method method:methods) {
			Annotation[] annotations = method.getAnnotations();
			
			for(Annotation anno:annotations) {
				if(anno.annotationType().equals(MyAnnotationDate.class)) {
					MyAnnotationDate m =(MyAnnotationDate)anno;
					int day=m.day();
					System.out.println(day);
					
				
					
				}
			}
		}
		
		

	}

}
