package practice;

import java.util.Scanner;

public class SquareRoot {
	public static double customSqrt(double n) {
		double epsilon = 1e-15;
		if(n==0) return 0;
		double guess = n;
		double root;
		
//		newton raphson formula
		
		while(true) {
			root = 0.5*(guess + (n/guess));
			if(Math.abs(root-guess) < epsilon) {
				break;
			}
			guess = root;
		}
		return root;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		for(int i=1;i<=n/2;i++) {
//			if(i*i==n) {
//				System.out.println("square root of the given number is : "+i);
//				break;
//			}
//		}
		
		double n = s.nextDouble();
		
		System.out.println("sqrt with Math.sqrt : "+Math.sqrt(n));
		System.out.println("sqrt with custom fun : "+customSqrt(n));
	}
}
