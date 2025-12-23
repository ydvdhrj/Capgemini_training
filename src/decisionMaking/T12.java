package decisionMaking;

import java.util.Scanner;

public class T12 {
	public static void main(String[] args) {
//		12. Ticket price:
//			•	Child (<12) → ₹100
//			•	Adult (12–60) → ₹200
//			•	Senior (>60) → ₹150
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("give your age:");
		int age = s.nextInt();
		System.out.print("Ticket price: ");
		if(age<12) {
			System.out.println(100);
		}
		else if(age>=12 && age<=60) {
			System.out.println(200);
		}
		else {
			System.out.println(150);
		}
	}
}
