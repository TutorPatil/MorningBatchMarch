package com.corejava.sample;

import java.util.Arrays;

public class TestCar {

	public static void main(String[] args) {
		
		// Declaration
		Car c2;
		
		// Construction
		c2 = new Car();
		
		// Both in  one line...
		Car fordIcon  =  new  Car();
		fordIcon.colour = "White";
		fordIcon.gears = 4;
		fordIcon.isAutomatic = true;
		fordIcon.fuelType = "Petrol";
		fordIcon.engineCapacity = 1200;
		
		
		fordIcon.drive();
		System.out.println(fordIcon.wheels);
		//System.out.println(Car.wheels);
		
		//fordIcon.wheels = 5;
		Car.CloseWindows();
		
		//Arrays.binarySearch(a, key)
		
		
		System.out.println("============");
		
		
		Car fordEco = new Car();
		fordEco.colour = "Black";
		fordEco.engineCapacity = 1000;
		fordEco.fuelType = "Diesel";
		fordEco.gears = 5;
		fordEco.isAutomatic = false;
		fordEco.drive();
		System.out.println(Car.wheels);
		Car.CloseWindows();
	
		
	}

}
