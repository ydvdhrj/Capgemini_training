package array;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
//		8.	Store marks of students in an array and find the second highest mark
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			arr[i] = s.nextInt();
		}
		int h = Integer.MIN_VALUE;
		int sh = Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>h) {
				sh = h;
				h = i;
			}
		}
		System.out.println("2nd highest marks is : "+sh);
	}
}
