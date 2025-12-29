package practice;

import java.util.Scanner;

public class SunnyNumber {
	public static boolean sqrt(int n) {
		for(int i=1;i<=n/2;i++) {
			if(i*i==n) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(sqrt(n+1)) System.out.println("it is sunny number");
		else System.out.println("it is not a sunny number");
		
	}
}
