package com.corejava.collections;

import java.util.*;

import com.corejava.interfaces.Car;
import com.corejava.strings.Dog;


public class April26_CollectionsList {

	public static void main(String[] args) {
		ListEx2();
	}
	
	public static void listEx1()
	{
		Dog d = new Dog();
		Dog d2 = new Dog();
		
		Car c = new Car();
		
		List al = new ArrayList();
		
			al.add("selenium");
			al.add(25);
			al.add("selenium");
			al.add(d);
			al.add(c);
			al.add(d2);
			al.add(null);
		
			System.out.println(al.size());
			
			System.out.println(al.contains(d));
			
			al.remove("selenium");
			
			
			System.out.println(al.size());
			
			
			System.out.println(al);	
			
			System.out.println(al.size());
			
		
		
		
		
		
	}
	
	public static void ListEx2()
	{
		List<String> al = new ArrayList<String>();
		
		al.add("selenium");
		al.add("java");
		al.add("selenium");
		al.add("mava");
		al.add(null);
		
		System.out.println(al);
		
		al.remove("selenium");
		al.contains("java");
		System.out.println(al.isEmpty());
		
	}

}
