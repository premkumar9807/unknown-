package kumar;

import java.util.Scanner;

public class Loan_Amount_Practice {

	public static void main(String[] args) {
		int loanAmount=0;
		int yearsOfService=0;
		System.out.println("Enter your marital status: Yes if married, No if unmarried");
		Scanner Status=new Scanner(System.in);
		String maritalStatus = Status.nextLine();
		System.out.println("maritalStatus: " + maritalStatus);
		System.out.println("Enter your years of service");
		yearsOfService = Status.nextInt();
		System.out.println("yearsOfService: " + yearsOfService);
		if(maritalStatus.equals("Yes")) {
			if(yearsOfService >= 30) {
				loanAmount = 50000;
			}else {
				loanAmount = 25000;
			}
		
		}else if(maritalStatus.equals("No")) {
			if(yearsOfService >= 30) {
				loanAmount = 60000;
			}else {
				loanAmount = 35000;
			}
		}else {
			loanAmount = 10000;
		}
		System.out.println("loanAmount is: " + loanAmount);
	}
}
