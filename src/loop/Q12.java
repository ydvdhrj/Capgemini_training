package loop;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
//		Read marks of 5 students and calculate total marks.
		Scanner s = new Scanner(System.in);
		int sum = 0;
		for(int i=1;i<=5;i++) {
			System.out.println("Marks of student "+i);
			int m = s.nextInt();
			sum+=m;
		}
		System.out.println("total marks are : "+sum);
	}
}
