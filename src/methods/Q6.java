package methods;

public class Q6 {
	public static void sal(int sal) {
		System.out.println(sal);
	}
	public static void sal(int sal, int bonus) {
		System.out.println(sal+bonus);
	}
	public static void main(String[] args) {
		int sal = 450000;
		int b = 50000;
		sal(sal);
		sal(sal,b);
	}
}
