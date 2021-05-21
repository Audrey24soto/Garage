package com.qa.helloworld.javabasic.polyabstract;

import java.util.Scanner;

//import com.qa.helloworld.booleen;

public class Car extends Garage {
	
	public static void main(String[] args) {
		Car.getMyList();
	
	}
	// Attributes 
	private String name;
	public int Seats;
	public int Wheels;
	public boolean clutch = false;
	public int doors;
	private String manufactureName1;
	public int carYear;
	Scanner scan1 = new Scanner(System.in);
	
	// Constructor
	public Car(String name, int Seats, int Wheels) {
		this.name = name;
		this.Seats = Seats;
		this.Wheels = Wheels;
		this.clutch = false;
		this.doors = doors;
		this.manufactureName1 = getManufactureName();
		this.carYear = carYear;}

	// Getters Method
	public int getYear() {
		carYear = 2019;
		return carYear;
	}
	public String getName() {
		return name;
	}
	// Getter Method
	public String getManufactureName() {
		return manufactureName1;

	}
			
		//setters
			public void setName(String name) { this.name = name; }
			public void setManufactureName(String manufactureName1) { this.manufactureName1 = manufactureName1; }
			public void setYear(int year) 
			
			{
		//Arrays
				
		Car arrCars1[];
		arrCars1 = new Car[3];
		arrCars1[0].carYear = 2019;
		arrCars1[0].name = "BMW";
		arrCars1[0].doors = 4;
		arrCars1[0].Seats = 5;
		arrCars1[0].Wheels = 4;
		
		arrCars1[1].carYear = 2013;
		arrCars1[1].name = "Ford";
		arrCars1[1].doors = 4;
		arrCars1[1].Seats = 5;
		arrCars1[1].Wheels = 4;
		
		arrCars1[2].carYear = 2010;
		arrCars1[2].name = "Scion";
		arrCars1[2].doors = 4;
		arrCars1[2].Seats = 4;
		arrCars1[2].Wheels = 4;}}			
					
				
			
			/* year cannot < 1900 or more that 2020				while (carYear < 1900 || carYear > 2019)
				{
					System.out.println("Please enter a valid year");
					carYear = scan1.nextInt();
				}
				this.carYear = carYear;
			}
			public String toString()
			{
				return name + " " + manufactureName + " " + Integer.toString(carYear);
			}
			booleen quit = false;
			String name1, manufactureName;
			int year = 0;
			Scanner scan = new Scanner(System.in);}
			
			
			
		while(!quit)
			{
				System.out.println("Please enter the car name, ManufactureName, and year: ");
				name = scan.next();
				manufactureName1 = scan.netc();
				carYear = scan.nextInt();
				
				car car = new car(name, manufactureName, 0);
				
				//assign data to object
				car.setName(name);
				car.setmanufactureName(manufactureName);
				car.setYear(year);
				scan.nextLine();
				
				System.out.println("Here's the data you provided: " + car);
				System.out.println("Press 'Q' to quit or any key to continue");
				toQuit = scan.nextLine();
				
				if (toQuit.equalsIgnoreCase("Q"))
					quit = true;
			}
			scan.close();
			System.out.println("Good Bye");
			}
			*/