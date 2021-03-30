package com.corejava.sample;

public class March30_Methods {

	public static void main(String[] args) {
		
		for( int x = 3; x<=100; x++)
		{
			boolean isPrime = checkPrime(x);
			
			if( isPrime)
			{
				System.out.println(x);
			}
		}
		
		
	}
	
//	int num = 6;
//	boolean result  = checkPrime(num);
//	if( result)
//	{
//		System.out.println("The num "+num + " is Prime ");
//	}
//	else
//	{
//		System.out.println("The num "+num + " is not Prime ");
//	}
	public static boolean checkPrime(int num)
	{
		int x = 2;
		boolean isPrime = true;
		
		while ( x < num)
		{
			if( num % x == 0)
			{
				isPrime = false;
				break;
			}					
			x++;
		}		
		
		return isPrime;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//int num = 5;		
//	int fact = findFactorial(num);		
//	System.out.println("The factorial of "+num + " is "+fact);
//	
	public static int findFactorial(int num)
	{
		//int temp = num;
		int fact = 1;		
		while( num > 1)
		{
			fact = (fact * num);
			num--;
		}
		
		////System.out.println("The factorial of "+temp +" is "+fact);
		return fact;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//String details = joinNameAndAge("Ramu",25);
	//System.out.println(details);
	public static String joinNameAndAge(String name, int age)
	{
		String details = (name +"  "+ age);		
		return details ;
			
	}
	
	
	
	
	
	
	
	
	
	//System.out.println(joinNameAndSurName("Ramu", "Kulkarni"));
	public static String joinNameAndSurName(String name, String surName)
	{
		
		String fullName = (name +"--"+surName);
		return fullName;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * int x = 10;
		int y = 20;
		int sum = addNumbers(x,y);
		System.out.println(sum);
		
	 * 
	 */
	
	public static int  addNumbers(int x, int y)
	{		
		int sum = (x+y);				
		return sum;
				
	}
	
	

}
