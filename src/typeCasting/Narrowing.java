package typeCasting;

public class Narrowing {
	public static void main(String[] args) {
		int a = 11235;
		System.out.println(a);
		byte b = (byte) a;
		System.out.println(b);
		char c = (char) a;
		System.out.println(c);
		
		double d = 214.543;
		System.out.println(d);
		int a2 = (int) d;
		System.out.println(a2);
		
		
	}
}
