package com.corejava.sample;

public class March25_SwitchAndLoops {

	public static void main(String[] args) {
		checkPrime();

	}
	
	public static void checkPrime()
	{
		int num = 9;
		int x = 2;
		
		
		while ( x < num)
		{
			if( num % x == 0)
			{
				System.out.println(" The number is not prime...");
				break;
			}
			else
			{
				System.out.println(" The number is  prime...");
			}
			
			x++;
		}
		
		
		
	}
	
	public static void printMultiplicatioTable1To5()
	{
		int x = 1;
		
		while ( x <= 5 )
		{
			int y = 1;			
			while ( y <= 10 )
			{
				System.out.println(x+" * "+y+" = "+(x*y));
				y++;
			}
			System.out.println("==============");
			x++;
		}
		
	}
	
	public static   void whileLoopNesting()
	{
		int x = 1;

		
		while( x <= 5 )
		{			
			System.out.println(" The value of x is "+x);
			int y = 1;
			while (y <= 5)
			{
				System.out.println("The value of y is "+y);
				y++;
			}
			System.out.println("================");
			x++;
		}
		
	}
	
	public static void switchExample()
	{
		int month = 11;
		
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			{
				System.out.println(" your month has 31 days....");				
				break;
			}
			case 2:
			{
				System.out.println(" your month has 28 or 29 days....");
				break;
			}		
			case 4:
			case 6:
			case 9:
			case 11:
			{
				System.out.println(" your month has 30 days....");
				break;
			}
			default:
			{
				System.out.println("Please  enter correct value for month");
				break;
			}
		
		
		
		}
		System.out.println("Out of switch.....");
		
	}
	
	public static void switchExampleString()
	{
		String browser = "edge";
		
		switch (browser)
		{
		
		case "chrome":
		{
			System.out.println(" RUunning the test cases using Chrome...");
			break;
		}
		case "firefox":
		{
			System.out.println(" RUunning the test cases using Firefox...");
			break;
		}
		case "edge":
		{
			System.out.println(" RUunning the test cases using Edge...");
			break;
		}
		default:
		{
			System.out.println("Please  enter correct value for browser");
			break;
		}	
		
		}
		System.out.println("Out of switch.....");
		
	}

	public static void whileLoop1()
	{
		int x = 5;
		
		while ( x >= 1 )
		{
			System.out.println(" The value of x is  "+x);
			x--;
			
		}
		System.out.println(" after the while loop.....");
		
	}
	
	public static void whileLoop2()
	{
		int x = 0;
		
		while ( x <= 5 )
		{
			System.out.println(" The value of x is  "+x);
			x++;
			
		}
		System.out.println(" after the while loop.....");
		
	}

	public static void printEvenNumbers1To100()
	{
		
		int x = 1;
		
		while( x <= 100)
		{
			if ( x % 2 == 0)
			{
				System.out.print(x+", ");
			}
			x++;
		}
	}

	public static void findFactorial()
	{
		int num = 5;
		int fact = 1;
		
		while( num > 1)
		{
			fact = (fact * num);
			num--;
		}
		
		System.out.println(" the factorial of the number is "+fact);
		
		
	}
	
}
