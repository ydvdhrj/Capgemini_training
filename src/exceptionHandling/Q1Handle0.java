package exceptionHandling;

import java.util.Scanner;

public class Q1Handle0 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number:");
		int a = s.nextInt();
		System.out.println("enter second number and it must not be 0");
		int b = s.nextInt();
		while(b==0) {
			System.out.println("input is 0 give another input");
			b = s.nextInt();
		}
		System.out.println("a / b is : "+a/b);
	}
}
