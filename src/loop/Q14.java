package loop;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
//		ATM menu should run at least once
//        and repeat until user selects Logout.

		Scanner s = new Scanner(System.in);
		String l;
		do {
			System.out.println("this is ATM menu \n to exit from here type logout");
			l = s.nextLine();
		}while(!l.equals("logout"));
	}
}
