package prem;

public class Practice1 extends Practice {
	
	public void empDetails() {
		
		System.out.println("Work...");
		
		super.empDetails();
		
	}
	
	public void empID(int a) {
		
		System.out.println("Salary..." + a);
		
		super.empID(a);
		
	}
	
	public static void main(String[] args) {
		
		Practice1 G = new Practice1();
		
		G.empDetails();
		G.empID(10201);
		
	}
	
}
