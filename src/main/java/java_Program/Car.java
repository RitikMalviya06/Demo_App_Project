package java_Program;

public class Car extends Vehicle {
	
	String colors = " ";
	String type = " ";
	int speed = 0;
	public Car(String n, int co, float mi,String col,String ty,int s) {
		super(n, co, mi);
		colors = col;
		type = ty;
		speed = s;
		// TODO Auto-generated constructor stub
	}

	
	public void show_car_detalis() {
		System.out.println("Colors of car"+" "+ colors);
		System.out.println("Type of car"+" " + type);
		System.out.println("Top Speed"+" " + speed);
	}

}
