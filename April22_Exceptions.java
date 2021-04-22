package com.corejava.exceptions;

import java.io.File;
import java.io.IOException;

public class April22_Exceptions {
	
	public static void main(String[] args) throws IOException   {		
	
		exThorowsExample();
		System.out.println("========================");
		
	}
	
	public static void exThorowsExample() throws IOException
	{		
		File f = new File("Z:\\sample.txt");		
		f.createNewFile();
	}
	
	
	public static void exceptionEx3()
	{
		int x = 10;
		int y = 10;
		int z = 0;			
		try
		{
			System.out.println("Inside the try blcok..");
			z = x/y;			
		}
		finally {
			System.out.println("============");
		}
	}
	
	
	public static void exceptionExample2()
	{
		int x = 10;
		int y = 10;
		int z = 0;			
		try
		{
			System.out.println("Inside the try blcok..");
			z = x/y;			
		}
		catch (Exception e)
		{
			System.out.println("Inside the Catch blcok..");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Inside the finally block...");
		}
		
		System.out.println("After the try catch and finally block..");
	}
	
	public static void exceptionHandling1()
	{
		int x = 10;
		int y = 5;
		int z = 0;	
		
		try
		{
			System.out.println("Inside the try blcok..");
			z = x/y;
			
			int[] a = {1,2,3,4,5};		
			System.out.println(a[10]);
		}
		catch (ArithmeticException ae)
		{
			System.out.println("Inside the Catch blcok..");
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Inside the catch block for ArrayIndex out of bounds exception ");
			ai.printStackTrace();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("after the try catch block..");
		System.out.println("The value of  z is "+z);
		
		
		
	}

}
