package methods;

public class Q8 {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void add(double a, double b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
//		8. A calculator performs(return calculations)
//		•	Add 2 numbers
//		•	Add 3 numbers
//		•	Add decimals
		int a = 4;
		int b = 8;
		int c = 12;
		double x = 12.5;
		double y = 52.5;
		add(a,b);
		add(a,b,c);
		add(x,y);
	}
}
