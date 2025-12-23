package loop;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
//		A temperature machine runs while temperature is within safe limit (≤ 100).
//	    Stop the system once temperature crosses the limit.

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=t;i<=100;i++) {
			System.out.println(t++);
		}
		System.out.println("temperature is out of range");
	}
}
