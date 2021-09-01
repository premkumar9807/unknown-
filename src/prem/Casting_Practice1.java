package prem;

public class Casting_Practice1 extends Casting_Practice {

	public static void main(String[] args) {
		
		//UP CASTING
		//	CHILD CLASS				//	CHILD CLASS
		Casting_Practice1 sonu = new Casting_Practice1();
		
		sonu.callHerName();
		
		//	PARENT CLASS			//	CHILD CLASS
		Casting_Practice co = new Casting_Practice1();
		
		co.callHerName();
		
		//DOWN CASTING
		
		//	CHILD CLASS						//	PARENT CLASS
		//Casting_Practice1 OBJECT NAME = new Casting_Practice(); --> NOT POSSIBLE
		
		
		//CHILD CAN ACCESS PARENT WITHOUT EXTEND KEYWORD BUT WE WANT TO USE PUBLIC MODIFIER IN PARENT CLASS
		
	}

	
}
