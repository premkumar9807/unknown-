package prem;

import java.util.Scanner;

public class Tax_Finding_Program {

	double salary;
	double Tax_Calculation;
	double HousingLoan;
	double EducationLoan;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary");
		
		double salary = sc.nextDouble();
		
		System.out.println("HousingLoan");
		
		double HousingLoan = sc.nextDouble();
		
		System.out.println("EducationLoan");
		
		double EducationLoan = sc.nextDouble();
		
		double Tax_Calculation = (salary - HousingLoan - EducationLoan);
		
		if(Tax_Calculation >= 1000000) {
			System.out.println("Your tax is 30%");
			
		}else if(Tax_Calculation >= 500000 && Tax_Calculation < 999999) {
			System.out.println("Your tax is 20%");
			
		}else if(Tax_Calculation <= 500000) {
			System.out.println("Your tax is 10%");
		}
		
	}
}
