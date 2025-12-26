package methods;

import java.util.Scanner;

public class Q3 {
	public static int total(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
//		3. A system should calculate total marks and return the result.
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(total(a,b,c));
	}
}
