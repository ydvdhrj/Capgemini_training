package array;

import java.util.Scanner;

public class T18 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] arr = {1,3,2,1,3,1,4,0,5,0,6,5,5,10};
		System.out.println("give the element to find the index");
		int a = s.nextInt();
		boolean b = true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println("index is : "+i);
				b = false;
			}
		}
		if(b) System.out.println("element is not present in array");
	}
}
