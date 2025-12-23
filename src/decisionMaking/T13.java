package decisionMaking;

import java.util.Scanner;

public class T13 {
	public static void main(String[] args) {
		
//		13. Admission rules:
//			•	Marks ≥ 90 and sports quota → Tier-1 seat
//			•	Marks ≥ 90 → Tier-2 seat
//			•	Marks ≥ 75 → Tier-3 seat
//			•	Else → Rejected

		Scanner s = new Scanner(System.in);
		System.out.println("enter your marks:");
		int m = s.nextInt();
		System.out.println("sports quota or not:");
		boolean b = s.nextBoolean();
		
		if(m>=90 && b) {
			System.out.println("Tier-1 seat");
		}
		else if(m>=90) {
			System.out.println("Tier-2 seat");
		}
		else if(m>=75) {
			System.out.println("Tier-3 seat");
		}
		else {
			System.out.println("rejected gawar kahi ka");
		}
	}
}
