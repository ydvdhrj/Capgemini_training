package methods;

import java.util.Scanner;

public class Q5 {
	public static void cal(int a) {
		System.out.println(a);
	}
	public static void cal(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
//		5. An e-commerce app calculates bill amount differently
//		•	One product
//		•	Two products

		Scanner s = new Scanner(System.in);
		
		int a = 120;
		int b = 200;
		cal(a);
		cal(a,b);
		
	}
}
