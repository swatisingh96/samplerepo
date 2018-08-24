package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList();
		l.add("abc");
		l.add("xyz");
		l.add("A");
		l.add("B");
		l.add("ABC");
		
		System.out.println(l);
		
		l.forEach(System.out::println);
		
		System.out.println("stream function");
		l.stream().filter(data->{return data.length()>=3; }).collect(Collectors.toList()).forEach(System.out::println);
	}

}
