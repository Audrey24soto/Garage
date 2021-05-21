package com.qa.helloworld.javabasic.polyabstract;

public class Motorcycle extends Garage {
	
	public static void main(String[] args) {
		Motorcycle.getMyList();
		
	}
	// Attributes
	private int speed;
	public String make;
	public String color;
	public boolean engineState = false;
	
	// Constructor
	public Motorcycle(String make, int speed, String color, boolean engineState) {
		this.make = make;
		this.color = color;
		this.speed = 0;
		this.engineState = engineState;
		
		
		//Getters
	}
	
	public String getMake(){
		return make;
	}
	
	public String carColor(){
		return color;
	}
	
	public boolean givenEngineState(){
		return engineState;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	
	
	// Setters 
	public void setMake(String make) { this.make = make;}
	public void setColor(String color) { this.color = color;}
	public void setSpeed(int speed) { this.speed = speed; }
	public void setEngineState(boolean engineState) {this.engineState = engineState;}
	
	// Arrays		
	
	Motorcycle arrMotorcycles1[]; {	
	arrMotorcycles1 = new Motorcycle[2];
	arrMotorcycles1[1].make = "Harley Davidson";
	arrMotorcycles1[1].color = "black";
	arrMotorcycles1[1].engineState = true;
	arrMotorcycles1[1].speed = 40;
	
	arrMotorcycles1[2].make = "street";
	arrMotorcycles1[2].color = "green";
	arrMotorcycles1[2].engineState = true;
	arrMotorcycles1[2].speed = 70;
	}
	
	
	void startEngine() {
		if (engineState == true)
			System.out.println("The engine is already on.");
			else {
				engineState = true;
				System.out.println("The engine is now on.");
			}
	}
	void ShowAtts() {
		System.out.println("This motorcycle is a "  + color + " " + make);
		if (engineState == true)
			System.out.println("The engine is on.");
		else System.out.println("The engine is off.");
	}
}