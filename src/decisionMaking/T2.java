package decisionMaking;
import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
//		check whether a given number is positive or negative number
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("give a input number : ");
		int a = s.nextInt();
		
		if(a<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("positive");
		}
	}
}
