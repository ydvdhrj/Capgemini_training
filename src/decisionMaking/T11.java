package decisionMaking;

import java.util.Scanner;

public class T11 {
	public static void main(String[] args) {
//		11. Check whether the  Password is:
//			•	Weak if length < 6
//			•	Medium if 6–9
//			•	Strong if ≥ 10
		
		
		Scanner s = new Scanner(System.in);
		String p = s.nextLine();
		if(p.length()<6) {
			System.out.println("weak");
		}
		else if(p.length() >=6 && p.length()<=9) {
			System.out.println("Medium");
		}
		else {
			System.out.println("strong");
		}
	}
}
