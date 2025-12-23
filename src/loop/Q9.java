package loop;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
//		An ATM allows a user to enter a PIN repeatedly until the correct PIN is entered.
		Scanner s = new Scanner(System.in);
		String p = "abcd123";
		String up;
		do {
			System.out.println("enter the correct password");
			up = s.nextLine();
		}while(!up.equals(p));
		System.out.println("Correct password login succefully");
	}
}
