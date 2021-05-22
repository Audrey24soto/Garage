package com.qa.helloworld.javabasic.polyabstract;


import java.util.LinkedList;

public class Garage  {	
    	
    	
    	
	public static void main(String[] args) {	
/*		LinkedList<Vehicle> myGarage = new LinkedList<Vehicle>();
		Vehicle curentVehicle = new Car();
		myGarage.add(curentVehicle);
		 curentVehicle = new Truck();
		myGarage.add(curentVehicle);
		curentVehicle = new Motorcycle();
		myGarage.add(curentVehicle);
		
		for(int i = 0; i <myGarage.size(); i++) {
			Vehicle prt = myGarage.get(i);
			
		
			
			System.out.println(prt.type + " " + prt.make + " " + prt.carYear + " Bill is " + calculatebill(prt.carYear) );
		    
		}
*/
		}
		
		
    
 
	//	truck = new Truck();
		
		//attributes
		
		public static double calculatebill(int year) {
			return 20*(2021-year);
		}			

	

	
	

	

	public static LinkedList<Vehicle> deleteVehiclebyID(int ID, LinkedList<Vehicle> workList) {
		workList.remove(ID);
		return workList;
	}
	
	public static LinkedList<Vehicle> emptygarage(LinkedList<Vehicle> workList) {
		
		for(int i = 0; i <workList.size(); i++) {
			workList.remove();
				
			}
		
		return workList;
	}
	
	public static LinkedList<Vehicle> addVehicle(String Vtype, LinkedList<Vehicle> workList) {
		Vehicle wildVehicle;
		
		if (Vtype == "Car") {
			
		
				wildVehicle = new Car();
	} else if (Vtype == "Truck") { 
		wildVehicle = new Truck();
			
		} else if (Vtype == "Motorcycle") {
			wildVehicle = new Motorcycle();
		} else {
			wildVehicle = null;
		}
	
		
		workList.add(wildVehicle);
		return workList;
	}
	public static LinkedList<Vehicle> deleteVehiclebytype(String type, LinkedList<Vehicle> workList) {
		
		for(int i = 0; i <workList.size(); i++) {
			Vehicle prt = workList.get(i);
			if (prt.type == type) {
				workList.remove();
			}
		
			
			
		}
		
		return workList;
	}
	}

