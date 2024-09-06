package java_Program;

public class Child extends Parents {
	
	String child_name = " ";
	int child_age = 0;

	public Child(String fn, String ln , String cn,int ca) {
		super(fn, ln);
		child_name = cn;
		child_age = ca;
		// TODO Auto-generated constructor stub
	}
	public void show_child_details() {
		System.out.println("  child name "+" "+child_name);
		System.out.println("  child age "+" "+child_age);
	}

}
