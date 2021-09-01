package prem;

public class Variables_Java {
	
	static int a = 46;
	
	public static void passport() {
		
		int a = 59;
		
		System.out.println("Local Variable:" + a);
		
	}
	
	public static void visa() {
		
		System.out.println("Class Variable:" + a);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Class Variable in main method:" + a);
		
		passport();
		
		visa();
		
	}

}
