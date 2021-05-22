package com.qa.helloworld.javabasic.polyabstract;



public class Car extends Vehicle {
	
	public static void main(String[] args) {
		
	}
	// Attributes 

	public int Seats = 2;
	public boolean clutch = false;
	public int doors = 4;
	
	
	
	// Constructor
	public Car() {
		this.weight = 2000;
		this.carYear = 2019;
		this.make = "BMW";
		this.type = "car";
	}
	
	
	
//Getters and Setters

	public int getSeats() {
		return Seats;
	}





	public void setSeats(int seats) {
		Seats = seats;
	}





	public boolean isClutch() {
		return clutch;
	}





	public void setClutch(boolean clutch) {
		this.clutch = clutch;
	}





	public int getDoors() {
		return doors;
	}





	public void setDoors(int doors) {
		this.doors = doors;
	}





	public void noise() {
	System.out.println("A new car has been put in garage.");
	}
	
}


