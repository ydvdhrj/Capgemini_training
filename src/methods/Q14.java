package methods;

import java.util.Scanner;

public class Q14 {
	public static void mul(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*n);
		}
	}
	public static void main(String[] args) {
//		14. Create a method to print multiplication table(user input)
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		mul(n);
	}
}
