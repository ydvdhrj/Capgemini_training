package practice;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int gcd = 1;
		if(b<a) {
			a = a^b;
			b = a^b;
			a = a^b;
		}
		for(int i=2;i<=a;i++) {
			if(a%i==0 && b%i==0) gcd=i;
		}
		System.out.println("gcd of given numbers is : "+gcd);
	}
}
