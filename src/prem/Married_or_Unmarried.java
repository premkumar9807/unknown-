package prem;

import java.util.Scanner;

public class Married_or_Unmarried {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Married Temporary Job Holder");

		int Married = sc.nextInt();

		if (Married >= 5) {
			System.out.println("Loan amount is Rs 10000");

		} else {
			System.out.println("Loan amount is Rs 5000");
		
		}

		System.out.println("Unmarried Temporary Job Holder");

		int Unmarried = sc.nextInt();

		if (Unmarried >= 5) {
			System.out.println("Loan amount is Rs 8333");

		} else {
			System.out.println("Loan amount is Rs 4166");
		
		}
		
		System.out.println("Temporary Job Holder with 30years of service");
		
		int Temporary_Job_Holder = sc.nextInt();
		
		if(Temporary_Job_Holder >= 30) {
			System.out.println("Loan amount is Rs 60000");
		
		}else {
			System.out.println("Loan amount is Rs 35000");
		
		}
		
		System.out.println("Married Permanent job holder with 30years of service");
		
		int Married_Permanent_job = sc.nextInt();
		
		if(Married_Permanent_job >= 30) {
			System.out.println("Loan amount is Rs 60000");
			
		}else {
			System.out.println("Loan amount is Rs 35000");
			
		}
		
		System.out.println("Unmarried Permanent job holder with 30years of service");
		
		int Unmarried_Permanent_job = sc.nextInt();
		
		if(Unmarried_Permanent_job >= 30) {
			System.out.println("Loan amount is Rs 50000");
			
		}else {
			System.out.println("Loan amount is Rs 25000");
			
		}
		
		System.out.println("Married Permanent job holder with 25years of service");
		
		int Married_Permanent_job1 = sc.nextInt();
		
		if(Married_Permanent_job1 >= 25) {
			System.out.println("Loan amount is Rs 50000");
			
		}else {
			System.out.println("Loan amount is Rs 30000");
		}

	}
}
