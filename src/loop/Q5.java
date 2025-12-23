package loop;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
//		Calculate the sum of even numbers from 1 to N.
		Scanner s = new Scanner(System.in);
		System.out.println("input :");
		int n = s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}
}
