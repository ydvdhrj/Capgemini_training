package methods;

import java.util.Scanner;

public class Q7 {
	public static int update(int b, int d, int w) {
		b = b+d-w;
		return b;
	}
	public static void main(String[] args) {
//		7. ATM should:
//			•	Accept balance & withdrawal amount
//			•	Return updated balance
//			•	Use methods properly

		Scanner s = new Scanner(System.in);
		int b = 1000;
		System.out.println("deposite amount:");
		int d = s.nextInt();
		System.out.println("withdraw amount:");
		int w = s.nextInt();
		b = update(b,d,w);
		System.out.println("updated balance: "+b);
	}
		
}
