package prem;

public class Mutable_String_Buffer {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Welcome Home");
		
		StringBuffer ss = new StringBuffer("Welcome Home");
		
		System.out.println(System.identityHashCode(s));
		
		System.out.println(System.identityHashCode(ss));
		
		s.append(ss);
		
		System.out.println(s);
		
		System.out.println(System.identityHashCode(s));
	}
}
