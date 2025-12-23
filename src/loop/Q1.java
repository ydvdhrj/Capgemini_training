package loop;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		System.out.print("give the input number for table: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a*i);
		}
	}
}
