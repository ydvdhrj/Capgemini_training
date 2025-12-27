package array;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
//		10.	Employee salaries are stored in an array. Increase each salary by 10% and display the result.
		Scanner s = new Scanner(System.in);
		int[] sal = new int[5];
		
		for(int i=0;i<5;i++) {
			sal[i] = s.nextInt();
			sal[i] += sal[i]*10/100;
		}

		System.out.println("salary increased by 10% : ");
		for(int i:sal) {
			System.out.println(i +" ");
		}
		
		
	}
}
