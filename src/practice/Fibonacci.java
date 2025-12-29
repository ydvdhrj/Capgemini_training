package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int r = s.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("fibonacci number between range:");
		while(a<=r) {
			if(a>=l) {
				System.out.print(a+" ");		
			}
			int n = a+ b;
			a = b;
			b = n;
		}
	}
}
