package com.corejava.sample;

import java.util.Arrays;

public class April5_CoreJava {

	public static void main(String[] args) {
		
		if(args[0].equals("chrome"))
		{
			System.out.println("Running the test cases using chrome...");
		}
		if(args[0].equals("firefox"))
		{
			System.out.println("Running the test cases using firefox...");
		}
		
	}
	
	//varArgs(1,2,3,4,5,6,8);
	public static void varArgs(int...x)
	{
		int sum = 0;
		
		for(int i=0; i<x.length;i++)
		{
			sum = sum+x[i];
		}
		
		System.out.println(sum);
		
	}
	
	
	public static void findMinAndMaxFromTwoArrays()
	{
		int[] x = {5,3,8,1,15,25};
		int[] y = {18,300,12,55,100,4};
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		int min = 0;
		int max = 0;
		
		if( x[0] < y[0])
		{
			min=x[0];
		}
		else
		{
			min = y[0];
		}
		
		if( x[x.length-1] > y[y.length-1])
		{
			max=x[x.length-1];
		}
		else
		{
			max = y[y.length-1];
		}
		
		System.out.println("The mininimum value is "+min);
		System.out.println("The maxinum value is "+max);
	}
	
	public static void findMinAndMaxFromTwoArrays1()
	{
		int[] x = {5,13000,800,11,10,225};
		int[] y = {18,300,1,55,100,4,44,65,120};
	
		int min = x[0];
		int max = x[0];		
		int i = 0;
		
		while (i < x.length || i < y.length)
		{
			if(i< x.length)
			{
				if(x[i] < min )
					min=x[i];
				if(x[i]  > max )
					max = x[i];
			}
			
			if( i< y.length)
			{
				if(y[i] < min )
					min=y[i];
			
				if(y[i]  > max )
					max = y[i];
			}
		i++;
		}
		System.out.println(min);
		System.out.println(max);
		
		}

}
