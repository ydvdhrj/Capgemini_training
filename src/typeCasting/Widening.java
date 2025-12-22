package typeCasting;

public class Widening {
	public static void main(String[] args) {
		byte b = 30;
		System.out.println(b);
		short s = b;
		System.out.println(s);
		int a = s;
		System.out.println(a);
		double d = a;
		System.out.println(d);
		
		
		char c = 'a';
		System.out.println(c);
		
		int i = c;
		System.out.println(i);
		
		
		float f = 45.89f;
		System.out.println(f);
		double d2 = f;
		System.out.println(d2);
		
		long l = 9223372036854775807l;
		System.out.println(l);
		
		float f2 = l;
		System.out.println(f2);
		
		
	}
}
