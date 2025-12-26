package methods;

import java.util.Scanner;

public class Q9 {
	public static void grade(int a, int b, int c) {
		int t = (a+b+c)/3;
		if(t>80) {
			System.out.println("grade A");
		}
		else if(t>60) {
			System.out.println("grade B");
		}
		else if(t>40) {
			System.out.println("grade C");
		}
		else {
			System.out.println("Fail");
		}
		
	}
	public static void main(String[] args) {
//		9. A system should:
//			•	Accept marks(atleast 3 subject marks)
//			•	Calculate total
//			•	Return grade
		Scanner s = new Scanner(System.in);
		System.out.println("give 3 subj marks out of 100 each");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		grade(a,b,c);
	}
}
