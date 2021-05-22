package com.qa.helloworld.javabasic.polyabstract;



public class Motorcycle extends Vehicle {
	
	public static void main(String[] args) {
		
		
	}
	// Attributes
	public int speed = 30;

	
	
	// Constructor
	public Motorcycle() {
		this.make = "Harley";
		this.weight = 1000;
		this.carYear = 2020;
		this.wheels = 2;
		this.type = "Motorcycle";
	}		
		//Getters



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void noise() {
		System.out.println("A new motorcycle has been put in garage.");
		}
	

}