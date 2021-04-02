package com.corejava.sample;

import java.util.Arrays;
import java.util.Scanner;

public class April2_Arrays {
	

	public static void main(String[] args) throws InterruptedException {
		
		//int[] x = {10,20,15,5,25,16,8};
		
		//Arrays.parallelSort(x);
		
		///System.out.println(Arrays.toString(x));
		
		//Arrays.sort(x);
		
		//Arrays.sort(x, 2, 5);
		
		//System.out.println(Arrays.toString(x));
		scannerEx1();
	}
	
	public static void scannerEx1()
	{
		
		System.out.println("Please enter your mobile num");
		
		Scanner src = new Scanner(System.in);
			int mobile = src.nextInt();
			
			System.out.println(" You have  ented your number as "+mobile);
		
		System.out.println("Please enter your name");
		
		Scanner src1 = new Scanner(System.in);
		String name = src1.nextLine();
						
				System.out.println("Your name is "+name);	
		
		
	}
	
	
	
	public static void twoDArrayEx2() throws InterruptedException
	{
		long[][] x = new long[3][];
		
		x[0] = new long[4];
		x[1] = new long[3];
		x[2] = new long[2];
		
		for(int i = 0; i<x.length;i++)
		{
			for(int j=0; j<x[i].length;j++)
			{
				//int data = (int) System.currentTimeMillis();
				long data =  System.currentTimeMillis();
				Thread.sleep(2000);
				x[i][j] = data;
				
			}
		}
			for(int i = 0; i<x.length;i++)
			{
				for(int j=0; j<x[i].length;j++)
				{
					System.out.print(x[i][j]+ " ");
				}
				System.out.println();
			}
			
		}
		
	public static void twoDArrayEx1()
	{
		int[][] x = new int[3][3];
		
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;
		
		x[1][0] = 40;
		x[1][1] = 50;
		x[1][2] = 60;
		
		x[2][0] = 70;
		x[2][1] = 80;
		x[2][2] = 90;
		
		//System.out.println(x.length);
		//System.out.println(x[0][2]);
		
		for ( int i=0; i<x.length;i++)
		{
			for(int j=0; j<x[i].length;j++)
			{
				System.out.println(x[i][j]);
			}
		}		
	}
	
	
	//String[] s =joinEmpDetails("sudhanva","patil","tutorpatil@gmail.com");
	//System.out.println(Arrays.toString(s));

	public static String[] joinEmpDetails(String name, String surName, String email)
	{
		
		String[] s = new  String[3];
		
		s[0] = name;
		s[1] = surName;
		s[2] = email;
		
		return s;
	}
	
		///String[] s = {"selenium","java","automation"};
	
		//boolean isPresent = searchElementInStringArray(new String[] {"selenium","java","automation"},"selenium");
		//System.out.println(isPresent);
			
	public static boolean searchElementInStringArray(String[] s, String key)
	{
		boolean isPresent = false;
		
		for ( String m : s)
		{
			if (m.equals(key))
			{
				isPresent=true;
				break;
			}
			else
			{
				isPresent=false;
			}
		}
		
		
		return isPresent;
	}
}
