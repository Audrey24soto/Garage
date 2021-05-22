package com.qa.helloworld.javabasic.polyabstract;



public class Truck extends Vehicle {
	
	public static void main(String[] args) {
		
	}
	// Attributes
	
	public boolean bed = true;
	public String color = "black";

	
	// constructor
	public Truck() {
		this.weight = 3000;
		this.carYear = 2011;
		this.make = "Ford";
		this.type = "Truck";
	}
	
	
	
	
	// Getters
	
		
	
	public void noise() {
		System.out.println("A new truck has been put in garage.");
		}

	public boolean isBed() {
		return bed;
	}

	public void setBed(boolean bed) {
		this.bed = bed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}