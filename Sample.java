package com.corejava.sample;

public class Sample{
	
	static int bonus = 5000 ;	
	private int personSalary = 4545454;
	static boolean isMarried;
	
	public static void main(String[] args) {	
		
		System.out.println("inside the main method....starting");
		
		// Declaration
		int age;		
		// Initialiation
		age = 20;
		
		// both in one line
		final int comm = 0;
		
		//comm = 500;		
		boolean result = false;
		boolean isMarried  = true;
		
		//System.out.println("Commison--" +comm);
		//System.out.println("Bonus--"+bonus);		
		System.out.println("isMarried----"+isMarried);
		System.out.println("result---"+result);
		
		method1();
		System.out.println("bonus---"+bonus);	
		
		
		System.out.println("isMarried----"+isMarried);
		
		System.out.println("Ending the main method....");
		
	/*
		
		
		System.out.println("Welcome to java by patil....");
		System.out.println("Java seems to be interesting.....");		
		
		System.out.println(age);		
		System.out.println("The employee name is Ramu and his age is "+age);
		method1();		
		
		
		Sample s = new Sample();		
		System.out.println(s.personSalary);
		s.method2();		
		
		System.out.println("Ending the main method....");
		
		if (bonus == 2000)
		{
			System.out.println("The emp is eligible for a promotion");
		}
		else
		{
			System.out.println("The emp is not eligible for a promotion");
		}
		*/	
		
	}

	public static void method1()
	{
		System.out.println("inside method1  ");
		int sal = 5000;
		int comm = 1500;
		
		int income = (sal + comm);
		System.out.println(income);
		System.out.println("Ending method1  ");
		
		
		/*
		System.out.println(bonus);
		//method2();
		bonus = 10000;
		System.out.println(bonus);
		//Sample s = new Sample();
		//s.method2();
		*/
		
	}

	public void method2()
	{
		System.out.println("inside method 2 this is non static method....");
		System.out.println(personSalary);
		
		
		System.out.println(bonus);
		//method1();
		
	}



}
