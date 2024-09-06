package java_Program;

public class Person {
	
	String name = " ";
	String bloodgroup = " ";
	int age = 0;
	
	public Person (String n,String bg, int a) {
		name = n;
		bloodgroup = bg;
		age = a;
	}
	public void show_person_details() {
		System.out.println("name"+" "+name);
		System.out.println("blood group "+" "+bloodgroup);
		System.out.println("age"+" "+age);
	}

}
