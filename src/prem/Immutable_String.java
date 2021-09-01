package prem;

public class Immutable_String {

	public static void main(String[] args) {
		
		String s = "Practicing Java";
		
		String ss = "Practicing Java";
		
		System.out.println(System.identityHashCode(s));
		
		System.out.println(System.identityHashCode(ss));
		
		s = s + ss;
		
		System.out.println(s);
		
		System.out.println(System.identityHashCode(s));
	}
}
