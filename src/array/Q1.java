package array;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
//		4.	Marks are stored in an array. Count how many students passed (>=35).
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i] = s.nextInt();
		}
		int passed = 0;
		for(int i:arr) {
			if(i>=35) passed++;
		}
		System.out.println("number of student passed : "+passed);
		
		
	}
}
