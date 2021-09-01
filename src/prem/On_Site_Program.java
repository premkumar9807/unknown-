package prem;

import java.util.Scanner;

public class On_Site_Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Did Employee Have Passport or not : yes (or) no");
		
		String pass = sc.nextLine();
		
		System.out.println("Communication : good or bad");
		
		String comm = sc.nextLine();
		
		System.out.println("Training feedback : good or bad");
		
		String feedback = sc.nextLine();
				
		System.out.println("Did have atleast 2 years Experience");
		
		double year = sc.nextDouble();
				
		System.out.println("Age?????");
		
		int age = sc.nextInt();
				
		if(pass.equalsIgnoreCase("yes") && comm.equalsIgnoreCase("good") && feedback.equalsIgnoreCase("good") && year >= 2 && age >=23) {
	
		System.out.println("Elligible for on site");
		
		}else {
			
			System.out.println("Not Elligible for on site");
		}
		
		
		
		}
}
