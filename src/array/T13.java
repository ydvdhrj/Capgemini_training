package array;

import java.util.Scanner;

public class T13 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,10};
		System.out.println("give element to check exitance");
		int e = s.nextInt();
		boolean c = true;
		for(int i:arr) {
			if(i==e) {
				System.out.println("yes it exists");
				c = false;
			}
		}
		if(c) {
			System.out.println("element does not exists");
		}
	}
}
