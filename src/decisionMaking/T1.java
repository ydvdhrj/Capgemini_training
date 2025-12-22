package decisionMaking;
import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
//		check whether the given number is even or odd?
		
		Scanner s = new Scanner(System.in);
		System.out.print("give a integer : ");
		int a = s.nextInt();
		
		if(a%2==0) {
			System.out.println("input is even number");
		}
		else {
			System.out.println("input is odd number");
		}
	}
}
