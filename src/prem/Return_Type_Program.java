package prem;

public class Return_Type_Program {

	public static int add() {	//now it returned as int add() = 2546 by changing void to static int
		
		int a = 2546;
		
		return a;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(add());	//we can call method directly without creating object
		
		int b = add();	//add() will directly return the value to b 
		
		System.out.println("value of b : " + b);
	}
}
