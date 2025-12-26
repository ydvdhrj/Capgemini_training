package methods;

import java.util.Scanner;

public class Q12 {
	public static int max(int a, int b) {
		if(a>=b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static void main(String[] args) {
//		12. Design a method that returns the maximum of 2 numbers.
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int m = max(a,b);
		System.out.println(m);
	}
}
