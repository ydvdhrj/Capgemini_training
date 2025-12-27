package practice;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = 0;
		int d = n;
		while(d!=0) {
			int r = d%10;
			d/=10;
			m = m*10 + r;
		}
		if(m==n) {
			System.out.println("number is palindrom");
		}
		else {
			System.out.println("number is not palindrom");
		}
	}
}
