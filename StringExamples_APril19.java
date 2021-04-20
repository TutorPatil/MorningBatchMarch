package com.corejava.strings;

public class StringExamples_APril19 {
	
	public static void main(String[] args) {
		
		String s = "selenium";
		
		System.out.println(s.length());
		
		System.out.println(s);
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.indexOf('e'));
		
		System.out.println(s.lastIndexOf('e'));
		
		System.out.println("=====================");
		
		for(int x=0; x<s.length();x++)
		{
				System.out.print(s.charAt(x));
		}
		System.out.println();
		
		for(int y=s.length()-1;y>=0;y--)
		{
			System.out.println(s.charAt(y));
		}
		
		System.out.println("+++++++++++++++++");
		
		String m = "selenium";
		String mRev = "";
		
		for(int y=m.length()-1;y>=0;y--)
		{
			char c = m.charAt(y);
			mRev = mRev+c;
			
		}		
		System.out.println(mRev);
		
		
		System.out.println(s.contains("sel")); // contains
		
		System.out.println(s.contains("es")); // false
		
		String n = "java";
		
		System.out.println(n.length());
		
		System.out.println(n.trim().length());  // removes leading and trailing spcaes
		
		System.out.println(n.startsWith("ja"));
		
		System.out.println(n.endsWith("va"));
		
		
	}
	
	
	public static void stringExample4()
	{
		String s = "java";
		String s1 = "java";			
		
		System.out.println(s==s1);		
		System.out.println(s.equals(s1));
		
		System.out.println("==============");
		
		String s2 = new String("java");		
		String s3 = new String("java");
		
			
		System.out.println(s2 == s3);		
		System.out.println(s2.equals(s3));
	}
	public static void stringEx1()
	{
		//Creating String objects using String key word		
		// Objects will be stored in String constant Pool ( PermGen Area of Heap memory )
		String s = "selenium";		
		s = "java";		
		String s1 = "java";
		
		
		// Creating using the constructor like other objects
		// Objects are stored on the regular Heap area..
		String s2 = new String("java");		
		s2 = new String("selenium");
	}
	
	public static void stringExample2()
	{
		String s = "selenium";
		
		System.out.println(s.length());
		
		String s1 = s.toUpperCase();
		
		System.out.println(s);
		
		System.out.println(s1);
		
		String s2 = new String("selenium");
		
		s2 = s2.toUpperCase();
		
		 System.out.println(s2);
		
	}
	
	public static void stringEx3()
	{
		String s = "java";
		
		String s1 = "java";
		
		System.out.println(s);
		
		System.out.println(s.toString());
		
		Dog d = new Dog();
		
		System.out.println(d);
		
		System.out.println(d.toString());
	}
}
