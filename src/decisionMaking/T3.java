package decisionMaking;

import java.util.Scanner;

public class T3 {
	public static void main(String[] args) {
//		check whether the given number is positive, negative or zero?
		
		Scanner s = new Scanner(System.in);
		System.out.print("give a input number : ");
		
		int a = s.nextInt();
		
		if(a<0) {
			System.out.println("negative");
		}
		else if(a==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("positive");
		}
	}
}
