package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAdditionAnno {
	@AdditionAnnotation(number1 = 20,number2=21)
	public static void display() {
		System.out.println("display");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestAdditionAnno test= new TestAdditionAnno();
		Class class1 = test.getClass();
		Method[] methods=class1.getMethods();
		
		for(Method m:methods) {
			Annotation[] annotations=m.getAnnotations();
			for(Annotation anno:annotations) {
				if(anno.annotationType().equals(AdditionAnnotation.class)) {
					AdditionAnnotation a= (AdditionAnnotation)anno;
					int result=(a.number1()+a.number2());
					System.out.println("addition:-"+result);
				}
				
			}
		}
		
		
		

	}

}
