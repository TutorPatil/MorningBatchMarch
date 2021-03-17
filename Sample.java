package com.corejava.sample;

public class Sample {

	static int bonus = 1500;	
	int personSalary = 4545454;
	
	public static void main(String[] args) {		
		// This is a single line comment		
		/*
		 This is for commenting block of  code
		 All these lines  will be commented...		  
		 */
		
		System.out.println("Welcome to java by patil....");
		System.out.println("Java seems to be interesting.....");		
		int age = 20;
		System.out.println(age);		
		System.out.println("The employee name is Ramu and his age is "+age);
		method1();		
		System.out.println(bonus);
		System.out.println("Ending the main method....");
	}
	
	public static void method1()
	{
		int sal = 5000;
		System.out.println("inside method1 , sal is "+sal);
		System.out.println(bonus);
	}
	
	public void method2()
	{
		System.out.println("inside method 2 this is non static method....");
		System.out.println(personSalary);
		System.out.println(bonus);
	}
	
	

}
