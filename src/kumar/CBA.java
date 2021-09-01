package kumar;

public class CBA extends ABC {
	
	@Override
	public void studentDetails1(int a) {
		
		super.studentDetails1(a);
	
	}
	
	public static void main(String[] args) {
		
		ABC obj = new CBA();
		
		obj.studentDetails1(70);
	}

}
