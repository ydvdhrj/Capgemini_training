package methods;

import java.util.Scanner;

public class Q13 {
	public static void check(int age) {
		if(age>=18) {
			System.out.println("eligible");
		}
		else {
			System.out.println("not eligible");
		}
	}
	public static void main(String[] args) {
//		13. Create a method that accepts age and check whether he is eligible to vote or not.
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		check(age);		
		
	}
}
