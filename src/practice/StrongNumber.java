package practice;

import java.util.Scanner;

public class StrongNumber {
	public static int fact(int n) {
		int f = 1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		return f;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int t = n;
		while(t!=0) {
			int r = t%10;
			t/=10;
			sum+=fact(r);
		}
		if(sum==n) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("it is not a strong number");
		}
	}
}
