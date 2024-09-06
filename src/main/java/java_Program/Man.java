package java_Program;

public class Man extends Person implements Father  {

	int Salary = 0;
	public Man (String n, String bg, int a , int s) {
		super(n, bg, a);
		Salary = s;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println(" earn money ");
	}

}
