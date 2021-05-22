package com.qa.helloworld.javabasic.polyabstract;

public class Vehicle extends Garage {

	public Vehicle() {
	

	}
	
	// Attributes
    public double weight; 
	public int carYear;
	public int wheels = 4;
	public String make;   
	
	public String type;
	public static void main(String[] args) {
		// TODO Auto-generated method stub



//Getters and Setters
		
		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
