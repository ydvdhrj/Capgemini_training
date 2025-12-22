package decisionMaking;

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
//		check whether the given number is divisible by both 5 and 3 or not?
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("give an input number");
		
		int a = s.nextInt();
		
		if(a%5==0 && a%3==0) {
			System.out.println("divisible");
		}
		else {
			System.out.println("not divisible");
		}
	}
}
