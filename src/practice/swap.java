package practice;

import java.util.Scanner;

public class swap {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
//		with using temp
//		int temp = a;
//		a = b;
//		b = temp;
		
//		without using temp
		a = a^b;
		b = b^a;
		a = a^b;
		
		System.out.println("a : "+a+", b: "+b);
	}
}
