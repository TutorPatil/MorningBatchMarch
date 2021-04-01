package com.corejava.sample;

import java.util.Arrays;

public class April1_Arrays {
	
	// Assignments
	
	// 1) Write a method which takes an int array and a key... if the  key is present, then return true else return false
	// 2) Write a method which takes three string arguments name, surname and place and  store all of them into a string array and  return thr String array

	public static void main(String[] args) {
		

		
	}
	
	
//	int[] x = {10,15,5,1,25,18,12};			
//	int[] xSorted = sortIntArray(x);		
//	System.out.println(Arrays.toString(xSorted));
	public static int[] sortIntArray(int[] x)
	{
		for(int i=0; i<x.length;i++)
		{
			for (int j=i+1; j<x.length;j++)
			{
				int temp = 0;
				if(x[i] < x[j])
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;					
				}		
				
			}
		}
		
		return x;
	}
	
	
	
	
	
	
	
	
	
	
	public static void InbuiltArrayMethods()
	{
		
		int[] x = {10,15,5,1,25,18,12};		
		
		System.out.println(" Before Sorting");
		System.out.println(Arrays.toString(x));
		
		// sorting int array using in built method..
		Arrays.sort(x);
		
		// Converting array to String
		System.out.println("After Sorting....");
		System.out.println(Arrays.toString(x));
		
		// Searching elements from an array
		int m = Arrays.binarySearch(x, 25);
		
		if( m >=0 )
		{
			System.out.println("The required element is present");
		}
		else
		{
			System.out.println("The element is not present");
		}
			
		
		String[] s = {"selenium","java","automation"};
		
		System.out.println(Arrays.toString(s));
		
		Arrays.sort(s);
		
		
		System.out.println(Arrays.toString(s));
		
	}
	
	public static void sortIntArrayInAsc()
	{
		
		int[] x = {10,15,5,1,25,18,12};		
		System.out.println("Before Sorting");
		for (int m : x)
		{
			System.out.print(m+" , ");
		}		
		for(int i=0; i<x.length;i++)
		{
			for (int j=i+1; j<x.length;j++)
			{
				int temp = 0;
				if(x[i] < x[j])
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					
				}
				
				
			}
		}
		System.out.println(" After Sorting");
		
		for (int m : x)
		{
			System.out.print(m+" , ");
		}
		
		
	}
	
	public static void arrayEx2()
	{
		int[] x = {10,20,30,40,50};	
		
		/*
		// printing the Elements of Array in the reverse order
		for(int i=(x.length)-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}
		*/
		
		for(int i =0; i<x.length;i++)
		{
			System.out.println(x[i]);
			if ( x[i] == 30)
			{
				System.out.println("The required number is present in Array");
				break;
			}
		}
		
		System.out.println("++++++++++++++++++++++++++");
		
		for(int m : x)
		{
			System.out.println(m);
			if ( m == 30)
			{
				break;
			}
		}
		
		System.out.println("***********************");
		
		String[] s = {"java","Bhava","Mava"};
		
		// Searching for an element in String Array
		for(String m : s)
		{
			if(m.equals("Bhava"))
			{
				System.out.println("The Required String element "+m+" is preset");
				break;
			}
		}
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
		
		for( String m: s)
		{
			System.out.print(m+" , ");
		}
		
		
		
	}
	public static void arrayEx1()
	{
		// All  3 steps of Array can be combined in one line
		int[] x1 ;	
		
		x1 = new int[4];
		
		x1[0] = 10;
		x1[1]=20;
		x1[2] =30;
		x1[3]=40;
		
		
		int[] x = {10,20,30,40,50};		
		
		char[] c = {'a','b','c'};
		
		double[] d = {10.25,20.5,18.8};
		
		//System.out.println(x.length);
		
		//System.out.println(s.length);
		
		String[] s = {"java","Selenium","Automation"};
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
		//System.out.println(s);
		
		// Enhanced For loop or ForEach Loop
		System.out.println("=================");
		
		for(String i:s)
		{
			System.out.print(i+" ");
		}
	
		
	}

}
