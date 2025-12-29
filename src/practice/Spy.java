package practice;

import java.util.Scanner;

public class Spy {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		int p = 1;
		while(n!=0) {
			int r = n%10;
			n/=10;
			sum+=r;
			p*=r;
		}
		if(p==sum) {
			System.out.println("it is a spy number");
		}
		else {
			System.out.println("it is not a spy number");
		}
	}
}
