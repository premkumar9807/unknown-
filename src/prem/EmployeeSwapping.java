package prem;

public class EmployeeSwapping {
	
	int c,d;

	public EmployeeSwapping() {
		
		System.out.println("Default Constructor");
		
	}
	
	public EmployeeSwapping(int a, int b) {
		
		c=a;
		d=b;
		
	}
	
	public void add() {
		
		System.out.println(c+d);
		
	}
	
	public static void main(String[] args) {
		
		EmployeeSwapping singam1 = new EmployeeSwapping();
		EmployeeSwapping singam2 = new EmployeeSwapping(45,55);
		
		singam2.add();
	}
}
