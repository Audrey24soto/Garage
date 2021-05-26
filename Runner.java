package com.qa.helloworld;




import java.util.LinkedList;

import com.qa.helloworld.javabasic.polyabstract.Garage;
import com.qa.helloworld.javabasic.polyabstract.Car;
import com.qa.helloworld.javabasic.polyabstract.Motorcycle;
import com.qa.helloworld.javabasic.polyabstract.Truck;
import com.qa.helloworld.javabasic.polyabstract.Vehicle;

public class Runner {
	
	public static Vehicle prt;
	
	public static void main(String[] args) {
		
		System.out.println("Hello!");
	
		LinkedList<Vehicle> myGarage = new LinkedList<Vehicle>();
		Vehicle curentVehicle = new Car();
		myGarage.add(curentVehicle);
		 curentVehicle = new Truck();
		myGarage.add(curentVehicle);
		curentVehicle = new Motorcycle();
		myGarage.add(curentVehicle);
		
		for(int i = 0; i <myGarage.size(); i++) {
		 Vehicle prt = myGarage.get(i);
		int	yr = prt.carYear;
		
			
			System.out.println(prt.type + " " + prt.make + " " + prt.carYear + " Bill is " + Garage.calculatebill(yr));
		}
	}
}
		
		
		
		
		
	