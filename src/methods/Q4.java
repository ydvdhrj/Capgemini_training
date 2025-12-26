package methods;

import java.util.Scanner;

public class Q4 {
	public static int update(int b, int d, int w) {
		b = b+d-w;
		return b;
	}
	public static void main(String[] args) {
//		4. A bank wants to calculate updated balance after deposit.
		Scanner s = new Scanner(System.in);
		int b = 1000;
		System.out.println("deposite amount:");
		int d = s.nextInt();
		b = update(b,d,0);
		System.out.println("updated balance: "+b);
		
		
	}
}
