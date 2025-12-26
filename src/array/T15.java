package array;

import java.util.Scanner;

public class T15 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] arr = {1,3,2,1,3,1,4,0,5,0,6,5,5,10};
		System.out.println("give the element to count the frequency : ");
		int a = s.nextInt();
		int count = 0;
		for(int i:arr) {
			if(i==a) count++;
		}
		System.out.println("count of the given ele is : "+count);
		
	}
}
