package decisionMaking;

import java.util.Scanner;

public class T16 {
	public static void main(String[] args) {
//		16. Penalty rules:
//			•	Speed > 120 → License cancelled
//			•	Speed 90–120 → Heavy fine
//			•	Speed 60–89 → Normal fine
//			•	≤ 60 → No fine

		Scanner s = new Scanner(System.in);
		int speed = s.nextInt();
		if(speed>120) {
			System.out.println("License cancelled");
		}
		else if(speed>=90 && speed<=120) {
			System.out.println("Heavy fine");
		}
		else if(speed>=60 && speed<90) {
			System.out.println("Normal Fine");
		}
		else {
			System.out.println("No Fine");
		}
	}
}
