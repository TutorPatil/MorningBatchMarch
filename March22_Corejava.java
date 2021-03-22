package com.corejava.sample;

public class March22_Corejava {

	public static void main(String[] args) {
		
		
		
		relationalOperators();
		
	}
	
	public static void relationalOperators()
	{
		int x = 10;
		int y = 15;
		
		System.out.println(x > y);
		
		System.out.println(x < y);
		
		boolean b = ( 10 >= 15);
		
		System.out.println(10 <= 5);
		
		System.out.println(b);
	}
	
	public static void arithematicOperators()
	{
		//int x = 10;
		//int y = 25;
		
	//	int z = 10 + 5 ;
		//System.out.println(z);
		
		int x,y,z;
		x = 10;
		y = 25;
		z = (x + y);
		System.out.println(z);
		
		System.out.println(10/2);
		
		System.out.println(x/y);
		
		
		
		
		
	}
	
	public static void assignmentOperators()
	{
		
		int x    =      50;
		char c1 = 'd';
		
		// declaration
		int y;
		
		// Initialization..
		//	y = 15;
		
		System.out.println(y=15);
		
		/// Chained assignment
		int a,b,c;		
		a=b=c=20;
		
		
		// Compound assignment
		
		int i = 50;
		i += 25;  // i = (i + 25 );
		System.out.println(i);
		
		i -= 25;
		System.out.println(i);
		
		i *= 2;
		System.out.println(i);
		
		
		i /=  25;
		System.out.println(i);
		
		i %= 2;
		System.out.println(i);
		
		
		
		
		
		
	}
	
	public static void typeCastinngExample()
	{
		int x = 'a';		
		System.out.println(x);

		
		double  d = 50;		
		System.out.println(d);
		
		byte b = 15;
		System.out.println(b);
		
		byte b1 = (byte)150;
		
		System.out.println(b1);
	}

}
