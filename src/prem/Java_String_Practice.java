package prem;

public class Java_String_Practice {
	
	public static void main(String[] args) {
		
		String s = "School to college";
		
		//s.length  -->  print the string length
		int length = s.length();
		
		System.out.println(length);
		
		//s.equals  -->  check whether the given value is perfectly matches with the string value
		boolean equals = s.equals("School to College");
		
		System.out.println(equals);
		
		//s.equalsIgnoreCase  -->  just check the given value to the string value(not a case sensitive)
		boolean equalsIgnoreCase = s.equalsIgnoreCase("School to College");
		
		System.out.println(equalsIgnoreCase);
		
		//s.toUpperCase  -->  changes string value totally to a uppercases
		String upperCase = s.toUpperCase();
		
		System.out.println(upperCase);
		
		//s.LowerCase  -->  changes string value totally to a lowerCases
		String lowerCase = s.toLowerCase();
		
		System.out.println(lowerCase);
		
		//s.startsWith  -->  checks whether the given value only started in string value or not
		boolean startsWith = s.startsWith("Scho");
		
		System.out.println(startsWith);
		
		//s.endsWith  -->  checks whether the given value only ended in string value or not
		boolean endsWith = s.endsWith("lege");
		
		System.out.println(endsWith);
		
		//s.contains  -->  method searches the given sequence is there in string or not
		boolean contains = s.contains("oo");
		
		System.out.println(contains);
		
		//s.indexOf  -->  print the first index value of string which we were given
		int indexOf = s.indexOf("o");
		
		System.out.println(indexOf);
		
		//s.lastIndexOf  -->  print the first index value of string which we were given
		int lastIndexOf = s.lastIndexOf("l");
		
		System.out.println(lastIndexOf);
		
		//s.charAt  -->  print the particullar character by given index value of string
		char charAt = s.charAt(3);
		
		System.out.println(charAt);
		
		//s.replace  -->  used to replace a word or a single letter from the string
		String replace = s.replace("to", "2");
		
		System.out.println(replace);
		
		//s.substring  -->  used to start a string value from where we want
		String substring = s.substring(7);
		
		System.out.println(substring);
		
		//s.isEmpty  -->  check whether the string is empty or not
		boolean empty = s.isEmpty();
		
		System.out.println(empty);
		
		//s.split  -->  used to split a word one by one (or) used to split a letter by letter
		String[] split = s.split(" ");
		
		//iteration
		
		for (String str : split) {
			
			System.out.println(str);
				
		}
		
		//trim  -->  used to remove the unwanted spaces in the string 
		String ss = "        my    name    is          ";
		
		String trim = ss.trim();
		
		System.out.println(trim);
		
		//compareTo is actually used to subtract the values 
		String s1 = "g";
		String s2 = "b";
		
		int compareTo = s1.compareTo(s2);
		
		System.out.println(compareTo);
		
		//concat  -->  used to combine the two string values 
		String concat = s1.concat(s2);
		
		System.out.println(concat);
	}

}
