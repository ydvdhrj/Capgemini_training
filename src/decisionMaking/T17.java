package decisionMaking;

import java.util.Scanner;

public class T17 {
	public static void main(String[] args) {
//		17. User selects:
//			1.	Add
//			2.	Subtract
//			3.	Multiply
//			4.	Divide
//			5.	Note : don’t divide number by 0

		Scanner s = new Scanner(System.in);
		System.out.println("input 1:");
		int a = s.nextInt();
		System.out.println("input 2:");
		int b = s.nextInt();
		System.out.print("operation : ");
		String o = s.next();
		
		switch(o) {
		case "add":
			System.out.println(a+b);
			break;
		case "subtract":
			System.out.println(a-b);
			break;
		case "multiply":
			System.out.println(a*b);
			break;
		case "divide":
		{
			if(b==0) {
				System.out.println("cant be divisible by zero");
			}
			else {
				System.out.println(a/b);
			}
		}
		
		}
		
		
	}
}
