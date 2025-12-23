package loop;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
//		A Video game menu should be shown at least once,
//	       and continue until user selects "Exit".

		Scanner s = new Scanner(System.in);
		char c;
		do {
			System.out.println("this is a video game menu");
			System.out.println("for continueing type y or anything and for exit type e");
			c = s.next().charAt(0);
			
		}while(c!='e');
		
	}
}
