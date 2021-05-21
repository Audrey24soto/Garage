package com.qa.helloworld.javabasic.polyabstract;

public class Truck extends Garage {
	
	public static void main(String[] args) {
		Truck.getMyList();
	}
	// Attributes
	public String make;
	public String year;
	public String color;
	
	// constructor
	public Truck(String make, String year, String color) {
		this.make = make;
		this.year = year;
		this.color = color;}
	
	// Getters
	public String getMake() {
		return make;
	}
	public String getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}
	
	// Setters
	public void setName(String make) { this.make = make; }
	public void setYear(String year) { this.year = year; }
	public void setColor(String color) {this.color = color;}
	
	{
	
	//Arrays
		Truck arrTruck1[];
		arrTruck1 = new Truck[4];
		arrTruck1[1].color = "black";
		arrTruck1[1].make = "Ford";
		arrTruck1[1].year = "2019";
		
		arrTruck1[2].color = "blue";
		arrTruck1[2].make = "GMC";
		arrTruck1[2].year = "2015";
		
		
		arrTruck1[3].color = "pink";
		arrTruck1[3].make = "Toyota";
		arrTruck1[3].year = "2010";
		
		
		arrTruck1[4].year = "2013";
		arrTruck1[4].color = "green";
		arrTruck1[4].make = "Chevy";
		
	}

	public static void add(Truck truck) {
		// TODO Auto-generated method stub
		
	}

}