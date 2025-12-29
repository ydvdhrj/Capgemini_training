package practice;

import java.util.Scanner;

public class Composite {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean b = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				b=false;
			}
		}
		if(b) System.out.println("prime number");
		else System.out.println("composite number");
	}
}
