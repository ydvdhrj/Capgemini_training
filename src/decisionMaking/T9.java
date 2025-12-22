package decisionMaking;

import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {
//		scholarship is given if marks>=85 and family income <= 300000
		
		Scanner s = new Scanner(System.in);
		System.out.println("give your marks:");
		int marks = s.nextInt();
		System.out.println("give your family income:");
		int income = s.nextInt();
		
		if(marks>=85 && income<=300000) {
			System.out.println("you are eligible for scholarship");
		}
		else
			System.out.println("Not eligible");
	}
}
