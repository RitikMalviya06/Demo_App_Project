package java_Program;

public class Vehicle {
	 String name = " ";
	int cost = 0;
	float milleage = (float) 0.0;
	
	public Vehicle(String n ,int co,float mi) {
		name = n;
		cost = co;
		milleage = mi;
		
	}
	public void show_vehicle_detalis() {
		System.out.println("vehicle Name"+" "+name);
		System.out.println("Cost of vehicle"+" "+cost);
		System.out.println("Mileage of vehicle"+" "+milleage);
	}

}
