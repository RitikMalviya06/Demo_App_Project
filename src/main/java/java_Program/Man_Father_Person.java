package java_Program;
import java.util.Scanner;
public class Man_Father_Person {
	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter the name");
	    String name = scan.next();
	    
	    System.out.println("Enter the bloodgroup");
	    String bloodgroup = scan.next();
	    
	    System.out.println("Enter the age");
	    int age = scan.nextInt();
	    
	    System.out.println("Enter the salary");
	    int sal = scan.nextInt();
	    
	   Man m = new Man (name,bloodgroup,age,sal);
	   
	   m.task();
	   m.show_person_details();
	}
	
}
