package com.corejava.sample;

import java.awt.Color;

public class Car {
	
	String colour;
	int gears;
	boolean isAutomatic;
	int engineCapacity;
	String fuelType;
	final static int wheels = 4;
	Wiper w;
	
	public void drive()
	{
		int x = 20;
		System.out.println(" The car of the colour "+colour +
		"Of the fuel Type "+fuelType +" which has engine Capacity of "+engineCapacity +
		" is been driven....");
		 System.out.println(wheels);
		 w.wipeWindows();
		
	}
	
	public static void CloseWindows()
	{
		
		System.out.println(" The car which  has "+ wheels + " can close its windows automatically");
		
	}
	

}
