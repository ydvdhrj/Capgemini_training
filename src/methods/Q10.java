package methods;

import java.util.Scanner;

public class Q10 {
	public static void check(int n) {
		if(n%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}
	public static void main(String[] args) {
//		10. Create a method that returns whether a number is even or odd.
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		check(a);
		
	}
}
