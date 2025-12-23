package decisionMaking;

import java.util.Scanner;

public class T19 {
	public static void main(String[] args) {
//		Check whether the given character is Alphabet or Number or Special Character?
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		if(c>='0' && c<='9') {
			System.out.println("Number");
		}
		else if((c>='A' && c<='Z') || (c>='a' && c<='z')) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Special Character");
		}
	}
}
