package prem;

public class EmployeeDetails {

	public EmployeeDetails() {
		
		System.out.println("Default Constructor");
		
	}
	
	public EmployeeDetails(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails velu = new EmployeeDetails();
		
		EmployeeDetails velu1 = new EmployeeDetails(45,55);
	}
}
