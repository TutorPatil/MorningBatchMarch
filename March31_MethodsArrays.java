package com.corejava.sample;

public class March31_MethodsArrays {

	public static void main(String[] args) {
		
		// An array is indexed collection of fixed length of homogeneous data elements 
		arrayEx3();
		
	}
	
	public static void arrayEx1()
	{
		
		// Array Declaration
		int[] x;  // int x;
		
		int y[];		
		int [] z;
		
		// Array Construction
		
		x = new int[4];
		
		
		// Array Initialization
		
		x[0] = 10;
		x[1] = 20;
		x[2] = 10;
		x[3] = 40;
		///x[4] = 50;
		
		
		//System.out.println(x[1]);
		
		System.out.println(x.length);
		
		for(int  i =0; i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		
		
	}
	
	public static void arrayEx2()
	{
		
		//String[] s;
		
	//	s = new String[3];
		
		String[] s = new String[3];
		
		s[0] = "java";
		s[1] = "Bhava";
		s[2] = "Mava";
		
		System.out.println(s);
		
		for(int x=0; x<s.length;x++)
		{
			System.out.println(s[x]);
		}
		
	}
	
	public static void arrayEx3()
	{
		int m = 3;
		char[] c = new char[3];
		
		c[0] = 'a';
		c[1]  = 'b';
		c[2] = 'c';
		 // c[3] = 'd'; // Array Index out of Bounds exception...
		
		System.out.println(c.length);
		
		for( int x = 0; x<c.length;x++)
		{
			System.out.println(c[x]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	  System.out.println();
		
		System.out.println(210);
		
		System.out.println("selenium");
		
		System.out.println('c');
		
		System.out.println(true);	
		
		
		System.out.println(addNumbers(20, 30));
		
		 addNumbers(10, 20, 30);
		
		System.out.println(joinDetails(25 ,"Ramu"));
		
		System.out.println(joinDetails("Ramu",25));
	 */
	
	public static int addNumbers()
	{		
		return 0;
	}
	
	public static int addNumbers(int x)
	{		
		return x;
	}
	
	public static int addNumbers(int x, int y)
	{		
		return (x+y);
	}
	
	/* 
	 * Method overloading cant be achieved just by changing the return type / public/private access cotrollers)
	 
	public static void addNumbers(int x, int y)
	{		
		System.out.println(x+y);
	}
	*/
	
	public static int addNumbers(int x, int y, int z)
	{
		return( x+y+z);
	}
	
	public static String joinDetails(int age, String name)
	{
		return ( age + name);
		
	}
	
	public static String joinDetails(int age, String name, int sal)
	{
		return ( age + name+sal);
		
	}

	public static String joinDetails(String name,int age)
	{
		return ( age + name);
		
	}

}
