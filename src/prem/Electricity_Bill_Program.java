package prem;

import java.util.Scanner;

public class Electricity_Bill_Program {

	long Unit;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the unit");
		
		long Unit = sc.nextLong();
		
	
		if(Unit > 1000) {
			System.out.println("Per Unit Charges : Rs 10");
		
		}else if(Unit > 500 && Unit <= 999) {
			System.out.println("Per Unit Charges : Rs 5");
		
		}else if(Unit > 200 && Unit <= 499) {
			System.out.println("Per Unit Charges : Rs 2");
			
		}else {
			System.out.println("Per Unit Charges Rs : 1");
		}
	}
}
