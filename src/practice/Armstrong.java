package practice;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int t = n;
		while(t!=0) {
			int r = t%10;
			t/=10;
			sum += r*r*r;
		}
		if(sum==n) System.out.println("armstrong number");
		else System.out.println("not an armstrong number");
	}
}
