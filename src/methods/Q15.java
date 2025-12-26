package methods;

import java.util.Scanner;

public class Q15 {
	public static void sqr(int n) {
		System.out.println(n*n);
	}
	public static void main(String[] args) {
//		15.print the square of a number using method(user input)
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		sqr(n);
	}
}
