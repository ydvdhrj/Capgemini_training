package decisionMaking;

import java.util.Scanner;

public class T15 {
	public static void main(String[] args) {
//		15. User chooses role:
//			•	Admin
//			•	Manager
//			•	User
//			If role is valid, then check password.

		Scanner s = new Scanner(System.in);
		String role = "user";
		String p = "123asdfg";
		System.out.println("enter your role:");
		String urole = s.nextLine();
		System.out.println("enter your password:");
		String up = s.nextLine();
		if(urole.equals(role)) {
			if(up.equals(up)) {
				System.out.println("Login successfully");
			}
			else {
				System.out.println("Invalid password");
			}
		}
		else {
			System.out.println("Invalid role");
		}
	}
}
