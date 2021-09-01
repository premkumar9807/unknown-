package kumar;

public class Overload {

	public void personalDetails() {

		System.out.println("ID Proof");
		
	}
	
	public void personalDetails(int age) {
		
		System.out.println("Age : " + age);

	}
	
	public void personalDetails(int a, String b) {
		
		System.out.println(b + " " + a);

	}
	
	public void personalDetails(int year, int month) {
		
		System.out.println(year + month);

	}
	
	public static void main(String[] args) {
		
		Overload jail = new Overload();
		
		jail.personalDetails();
		
		jail.personalDetails(30);
		
		jail.personalDetails(420, "FIR CASE : ");
		
		jail.personalDetails(7, 6);
	}
}
