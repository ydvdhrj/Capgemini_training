package decisionMaking;

import java.util.Scanner;

public class T10 {
	public static void main(String[] args) {
//		10. If attendance < 75%, student pays fine:
//			•	below 60 → heavy fine
//			•	60–74 → light fine
		
		Scanner s = new Scanner(System.in);
		System.out.println("tell your attendance:");
		int attendance = s.nextInt();
		if(attendance < 60) {
			System.out.println("heavy fine");
		}
		else if(attendance >=60 && attendance <75) {
			System.out.println("light fine");
		}
		else {
			System.out.println("no fine");
		}
	}
}
