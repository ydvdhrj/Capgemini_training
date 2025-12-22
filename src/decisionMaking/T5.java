package decisionMaking;

import java.util.Scanner;

public class T5 {
	public static void main(String[] args) {
//		check whether the given character is vowel or not?
		
		Scanner s  = new Scanner(System.in);
		
		System.out.println("give a character input");
		char c = s.next().charAt(0);
		String v = "aeiouAEIOU";
		
		if(v.indexOf(c)!=-1) {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonent");
		}
	}
}
