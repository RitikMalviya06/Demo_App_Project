package java_Program;
import java.util.Scanner;

public class Parents_Child_GrandChild {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println(" Enter the parents first name ");
		String parentsfirstname = sca.next();
		
		System.out.println(" Enter the parents last name ");
		String parentslastname = sca.next();
		
		System.out.println(" Enter the child  name ");
		String childname = sca.next();
		
		System.out.println(" Enter the  child age  ");
	          int childage = sca.nextInt();
	          
	    System.out.println(" Enter the grand child  name ");
	  	String grandchildname = sca.next();
	  	
	  	System.out.println(" Enter the grand child age ");
	      int grandchildage = sca.nextInt();
	      
	       Grand_Child obj = new Grand_Child(parentsfirstname,parentslastname,childname,childage,grandchildname,grandchildage);
	       obj.show_parents_details();
	       obj.show_child_details();
	       obj.show_grand_child_details(); 
	      
	}

}
