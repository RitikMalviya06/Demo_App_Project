package java_Program;
import java.util.Scanner;

public class Detail_Vehicle_Car {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println(" Enter the vehicle Name");
		String vehiclename = sca.next();
		
		System.out.println(" Enter the Cost of vehicle");
		int vehiclecost = sca.nextInt();
		
		System.out.println("Enter the Mileage of vehicle");
		float vehiclemileage = sca.nextFloat();
		
		System.out.println(" Enter the Colors of car");
		String vehiclecolors = sca.next();
		
		System.out.println(" Enter the type of car");
		String vehicletype = sca.next();
		
		System.out.println(" Enter the car top Speed");
		int vehiclespeed = sca.nextInt();
		
		Car obj = new Car (vehiclename,vehiclecost,vehiclemileage,vehiclecolors,vehicletype,vehiclespeed) ;
		obj.show_vehicle_detalis();
		obj.show_car_detalis();
		
	}

}
