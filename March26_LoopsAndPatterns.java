package com.corejava.sample;

public class March26_LoopsAndPatterns {

	public static void main(String[] args) {
		
		printPattern4();
	}
	
	/*
	
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * *
	 
	*/
	
	public static void printPattern1()
	{
		for( int i=1;i<=5;i++)
		{
			for (int j=1; j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	

	/*
	 
	* 
	* * 
	* * * 
	* * * * 
	* * * * * 
	
	*/
	
	
	public static void printPattern2()
	{
		for( int i=1;i<=5;i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
 /*
	
	1 
	1 1 
	1 1 1 
	1 1 1 1 
	1 1 1 1 1
	
	 */
	
	public static void printPattern3()
	{
		for( int i=1;i<=5;i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
		
	}
	
	/*
	
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5
	
	*/ 
	
	
	
	public static void printPattern4()
	{
		for( int i=1;i<=5;i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	
	/* 
	 * Pattern assignments
	     
	     
	 * * * * * 
	 * * * * 
	 * * * 
	 * * 
	 *     
	     
	    
	  * * * * * 
	  	* * * * 
	  	  * * * 
	        * * 
	          * 
	   
	     
	 1
	 2 3
	 4 5 6
	 7 8 9 10
	 11 12 13 14   
	  
	 */
	
	public static void checkPrimeUsingFor()
	{
		int num  = 97;
		boolean isPrime = true;
		
		for( int x = 2; x< num; x++)
		{
			if(num % x == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime);
		
	}
	
	public static void printMultiplicatioTable1To5()
	{
		for( int x = 1; x<=5 ; x++)
		{
			for( int y = 1; y <=10; y++)
			{
				System.out.println(x+" * "+y+" = "+(x*y));
				
			}
			System.out.println("=============================");
		}
		
	}
	
	public static void printEven1To100()
	{
		for(int x =1 ; x<= 100; x++)
		{
			if( x % 2 == 0)
			{
				System.out.print(x+" ");
			}
		}
	}
	
	public static void forLoopEx1()
	{
		for(int x=0; x <= 5; x++)
		{
			System.out.println("The value of x is "+x);
			if (x == 3)
			{
				break;
			}
		}
		System.out.println("After the for loop....");
	}
	
	public static void forLoopEx2()
	{
		for(int x=5; x >= 1; x--)
		{
			System.out.println("The value of x is "+x);
		}
		System.out.println("After the for loop....");
	}
	
	public static void doWhileLoopExample()
	{
		int x = 5;
		do {
				System.out.println("The value of x is "+x);
			}
		while( x < 1);
		
		System.out.println("================");
		
		int  y = 5;
		
		while ( y < 1)
		{
			System.out.println(" The value of y is "+y);			
			y--;
		}
		
	}
	
	public static void checkPrime()
	{
		int num = 97;
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
		if(isPrime)
			System.out.println("The number is  a prime");
		else
			System.out.println("The number is not prime...");
		
}
	
}
