package prem;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//by creating scanner first want to import
		
		System.out.println("Enter the string");
		
		String str = sc.nextLine();		//nextLine() will allow anything like alphabet or number
		
		System.out.println(str);
		
		System.out.println("Enter the integer");
		
		int str1 = sc.nextInt();		//nextInt() will allow only numeric values
	
		System.out.println(str1);
		
		System.out.println("Enter the single letter");
		
		char str2 = sc.next().charAt(0);	//next().charAt(0) will print first letter of the word
	
		System.out.println(str2);
		
		System.out.println("Enter the string or char");
		
		String str3 = sc.next();		//next() will print first word of the sentences
	
		System.out.println(str3);
	}
}
