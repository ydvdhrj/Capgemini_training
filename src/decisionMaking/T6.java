package decisionMaking;

import java.util.Scanner;

public class T6 {
public static void main(String[] args) {
//	check whether the given input is present between 10 and 20 or not?
	
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	if (a>10 && a<20) {
		System.out.println("input is between 10 and 20");
	}
	else {
		System.out.println("out of range");
	}
}
}
