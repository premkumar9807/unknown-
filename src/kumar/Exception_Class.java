package kumar;

public class Exception_Class {

	public static void ageValidation(int age) throws InterruptedException {
		
		if (age >= 18) {
		
			Thread.sleep(500);
			
			System.out.println("Eligible for vote");
			
		} else {
			
			throw new ArithmeticException("Not eligible for vote");

		}

	}
	
	public static void main(String[] args) throws Exception {
		
		ageValidation(10);
	}
}
                        