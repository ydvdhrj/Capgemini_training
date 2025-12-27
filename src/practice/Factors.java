package practice;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int prod = n;
		int sum = 0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				prod*=i;
				sum+=i;
			}
		}
		System.out.println("prod of factors : "+prod+"\nsum of faactors: "+(sum+n));
		if(sum==n) {
			System.out.println("given number is perfect number");
		}
	}
}
