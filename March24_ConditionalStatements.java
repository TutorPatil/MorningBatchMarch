package com.corejava.sample;

public class March24_ConditionalStatements {

	public static void main(String[] args) {
		switchExample();
	}

	
	public static void ifExample1()
	{
		int x = 10;
		int y = 50;
		
		boolean result = (x > y);
		
		if(result)
		{
			System.out.println(" x is bigger than y");
		}
		System.out.println("After the if statement...");
		System.out.println("After the if statement...");
	}

	public static void ifElseExample()
	{
		int x = 10;
		int y = 50;
		
 		if(x > y )
		{
			System.out.println(" x is greater than y");
			
			if ( 5 == 6)
			{
				System.out.println(" inside the inner if true block...");
			}
			else
			{
				System.out.println(" inside the else block of inner   if ...");
			}
		}
		else
		{
			System.out.println(" y is greater than x");
			
			if(y > 2)
			{
				System.out.println(" Inside the if of the else block...");
			}
			else
			{
				System.out.println(" In the else block of the inner if of Else");
			}
		}
		System.out.println("After the if statement....");
		
	}


	public static void ifElseIfExample()
	{
		int  month = 10;
		
		if ( month == 1)
		{
			System.out.println(" you are born in Jan");
		}
		else if(month == 2)
		{
			System.out.println(" you are born in Feb");
		}
		else if(month == 3)
		{
			System.out.println(" you are born in March");
		}
		else if (month == 4)
		{
			System.out.println(" you are born in April");
		}
		else
		{
			System.out.println(" Please enter correct value for the month,,,,,");
		}
		System.out.println(" After the if Else........");
	}

	public static void ifElseIfExample2()
	{
		String browser = "firefox";
		
		if (browser.equals("chrome"))
		{
			System.out.println(" Running the test cases using chrome...");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println(" Running the test cases using Firefox.....");
		}
		else if(browser.equals("Edge"))
		{
			System.out.println("Running the test cases using Edge");
		}
		else
		{
			System.out.println(" Browser not supported.....");
		}
		System.out.println(" After the if else....");
		
		
	}

	public static void biggestOf3Numbers()
	{
		int a = 100;		
		int c = 50;
		int b = 200;
		
		if( a > b )
		{
			if( a > c)
			{
				System.out.println(" a is the biggest...");
			}
			else
			{
				System.out.println(" c is the biggest...");
			}
		}
		else
		{
			if( b > c )
			{
				System.out.println(" b is the biggest...");
			}
			else
			{
				System.out.println(" c is the biggest...");
			}
		}
		
		
	}
	
	
	public static void biggestOf3Numbers2()
	{
		int a = 100;		
		int c = 50;
		int b = 200;
		
		if ( (a > b) && ( a > c) ) {
			System.out.println(" a is the biggest");
		}
		else if((b > a ) && (b > c))
		 {
			 System.out.println(" b is the biggest");
		 }
	
		else if((c > a ) && (c > b))
		 {
			 System.out.println(" c is the biggest");
		 }
		System.out.println(" after the if else....");
	}

	public static void switchExample()
	{
		int month = 12;
		
		switch(month)
		{
			case 1: // if ( month == 1 )
			{
				System.out.println(" you are born in Jan");
				break;
			}
			case 2:// if ( month == 2 )
			{
				System.out.println(" you are born in Feb");
				break;
			}
			case 3 :
			{
				System.out.println(" you are born in March");
				break;
			}
			
			case 4 :
			{
				System.out.println(" you are born in April");
				break;
			}
			default:
			{
				System.out.println("Please  enter correct value for month");
				break;
			}
		
		
		
		}
		
	}
}
