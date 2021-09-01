package prem;

public class Type_Casting {

	public static void main(String[] args) {
		
		//WIDENING  -->  LOW TO HIGH  
		byte a = 25;		//BYTE = 1 --> 8 BIT
		
		int b = a;			//INT = 4 --> 32 NIT
		
		System.out.println(b);
	
		//NARROWING  -->  HIGH TO LOW
		double c = 50.2;			//DOUBLE = 8 --> 64 BIT
		
		float d = (float) c;		//FLOAT = 4 --> 32 BIT
	
		System.out.println(d);
	
	}
	
}
