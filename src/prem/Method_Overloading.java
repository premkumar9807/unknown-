package prem;

public class Method_Overloading {

	public void managerDetails() {
		
		System.out.println("Manager Details...");
		
	}
	
	public void managerDetails(int a) {
		
		System.out.println("Manager Details : " + a);
		
	}
	
	public void managerDetails(int a, String b) {
		
		System.out.println(b + " " + a);
		
	}
	
	public void managerDetails(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		Method_Overloading check = new Method_Overloading();
		
		check.managerDetails();
		check.managerDetails(5007);
		check.managerDetails(65, 35);
		check.managerDetails(94, "Manager mark : ");
	}
}
