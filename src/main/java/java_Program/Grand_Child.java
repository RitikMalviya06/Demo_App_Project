package java_Program;

public class Grand_Child extends Child {
	
	String grand_child_name = " ";
	int grand_child_age = 0;
	

	public Grand_Child(String fn, String ln, String cn, int ca , String gcn , int gca ) {
		super(fn, ln, cn, ca);
		grand_child_name = gcn;
		grand_child_age = gca;
		// TODO Auto-generated constructor stub
	}
	public void show_grand_child_details () {
		System.out.println("  grand child name"+" "+grand_child_name);
		System.out.println(" grand child age "+" "+grand_child_age);
	}

}
