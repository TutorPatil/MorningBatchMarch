package com.corejava.strings;

import java.util.Arrays;

public class April20_Strings {

	public static void main(String[] args) {
		stringBufferExample();

	}
	
	
	public static void stringBufferExample()
	{
		// Its a mutable class
		
		
		StringBuffer sb = new StringBuffer("selenium");
		
		sb.append(" webdriver");
		
		System.out.println(sb);
		
		sb.delete(2, 6);
		System.out.println(sb);
		
		sb.insert(5, " Automation ");
		
		System.out.println(sb);
		
		String s1 = "selenium";
		
		StringBuffer sb1 = new StringBuffer(s1);		
		sb1.reverse();		
		System.out.println(sb1);
		
		
		
	}
	
	
	public static void stringExample3()
	{
		String s = "selenium";
		
		System.out.println(s.hashCode());
		
		String s1 = "selenium";
		
		System.out.println(s1.hashCode());
		
		String s3 = "selenium Webdriver";
		
		String[] s3Array = s3.split(" ");
		
		System.out.println(Arrays.toString(s3Array));
		
		for(String m : s3Array)
		{
			System.out.println(m);
		}
		
		System.out.println(s3.substring(3));		
		System.out.println(s3.substring(3, 10));
		
		System.out.println(s3.concat(s));
		
		
		
		
		
	}
	
	public static void stringEx2()
	
	{
		
		int i = 1234;
		
		System.out.println(String.valueOf(i).length());
				
			// print only unique characters from a string
			
			String s2 = "classes";		
			String uString = "";
						
			for(int x=0; x<s2.length();x++)
			{
				char c = s2.charAt(x);
				String su = String.valueOf(c);
				
				if(!uString.contains(su))
				{
					uString = uString+c;
				}
				
				
			}
			
			System.out.println(uString);
	}
	

	public static void stringEx1()
	{
			String s = "selenium";
			
			//System.out.println(s.isEmpty());
			
			//s = s.replace("sel", "win");	
			//System.out.println(s);
			
			String s1 = "classes";
			int counter = 0;
			
			for (int x=0;x<s1.length();x++)
			{
				char c = s1.charAt(x);
				if (c == 's')
				{
					counter++;
				}
			}
					
			System.out.println(counter);
			
			int len1 = s1.length();
			int len2 = s1.replace("s", "").length();
			
			System.out.println(len1-len2);
			
			char[] cArray = s1.toCharArray();
			
			System.out.println(Arrays.toString(cArray));
			
			System.out.println("========================");
	
	
}

}
