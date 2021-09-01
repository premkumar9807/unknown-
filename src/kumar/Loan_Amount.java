package kumar;

import java.util.Scanner;

public class Loan_Amount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Married temporary job holder");
		
		String s1 = sc.nextLine();
		
		System.out.println(s1);
		
		System.out.println("Unmarried temporary job holder");
		
		String s2 = sc.nextLine();
		
		System.out.println(s2);
		
		System.out.println("Temporary job holder with 30 years of service");
		
		int Years_of_service = sc.nextInt();
		
		if(Years_of_service >= 30) {
			
			System.out.println("Loan Amount is 30000");
		
		}else {
			
			System.out.println("Loan Amount is 20000");
			
		}
		
		System.out.println("Married permanent job holder with 30 years of service");
		
		int Years_of_service1 = sc.nextInt();
		
		if(Years_of_service1 >= 30) {
			
			System.out.println("Loan Amount is 60000");
			
		}else {
			
			System.out.println("Loan Amount is 35000");

		}
		
		System.out.println("Unmarried permanent job holder with 30 years of service");
	
		int Years_of_service2 = sc.nextInt();
		
		if(Years_of_service2 >= 30) {
			
			System.out.println("Loan Amount is 50000");
			
		}else {
			
			System.out.println("Loan Amount is 25000");
			
		}
		
		System.out.println("Married permanent job holder with 25 years of service");
	
		int Years_of_service3 = sc.nextInt();
		
		if(Years_of_service3 >= 25) {
			
			System.out.println("Loan Amount is 50000");
			
		}else {
			
			System.out.println("Loan Amount is 30000");
		}
	}
}
