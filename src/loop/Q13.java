package loop;

import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
//		A wallet balance should reduce each time a transaction happens
//        until the balance becomes zero.

		Scanner s = new Scanner(System.in);
		System.out.println("balance : ");
		int b = s.nextInt();
		while(b!=0) {
			System.out.println("withdrawal amount : ");
			int w = s.nextInt();
			if(w>b) {
				System.out.println("insufficient balance");
			}
			else {
				b-=w;
			}
			System.out.println("remaining balance : "+b);
		}
	}
}
