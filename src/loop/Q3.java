package loop;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
//		Calculate the sum of digits of a given number
		Scanner s = new Scanner(System.in);
		System.out.println("input:");
		int a = s.nextInt();
		int sum = 0;
		while(a>0) {
			sum+=a%10;
			a/=10;
		}
		System.out.println(sum);
	}
}
