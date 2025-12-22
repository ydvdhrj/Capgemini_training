package loop;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c;
		do {
			System.out.println("Welcome");
			System.out.println("to print it again type y");
			c = s.next().charAt(0);
			
		}while(c=='y'||c=='Y');
		
	}
}
