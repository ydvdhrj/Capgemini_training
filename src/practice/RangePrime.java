package practice;

import java.util.Scanner;

public class RangePrime {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("left end of range");
		int l = s.nextInt();
		System.out.println("Right end of range");
		int r = s.nextInt();
		System.out.println("prime numbers in this given range are:");
		for(int i=l;i<=r;i++) {
			boolean b = true;
			for(int j = 2;j<=i/2;j++) {
				if(i%j==0) b=false;
			}
			if(b) System.out.print(i+" ");
		}
	}
}
