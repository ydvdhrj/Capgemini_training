package decisionMaking;

import java.util.Scanner;

public class T14 {
	public static void main(String[] args) {
//		14. Hike rules:
//			•	Rating 5 → 30% hike
//			•	Rating 4 → 20% hike
//			•	Rating 3 → 10% hike
//			•	Rating below 3 → No hike
//			•	Invalid rating → Error

		Scanner s = new Scanner(System.in);
		System.out.println("tell us about your ratting:");
		int r = s.nextInt();
		if(r==5) {
			System.out.println("30% hike");
		}
		else if(r==4) {
			System.out.println("20% hike");
		}
		else if(r==3) {
			System.out.println("10% hike");
		}
		else if(r<3) {
			System.out.println("no hike");
		}
		else {
			System.out.println("invalid rating");
		}
	}
}
