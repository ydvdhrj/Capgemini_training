package decisionMaking;

import java.util.Scanner;

public class T8 {
	public static void main(String[] args) {
//		an ATM allows withdrawal only if:
//		balance>=withdrawal amount and withdrawal amount is multiple of 100 and int balance = userinput, int amount = userinput
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("balance : ");
		int b = s.nextInt();
		System.out.print("withdarawal amount : ");
		int w = s.nextInt();
		
		if(b>=w && w%100==0) {
			b-=w;
			System.out.println("withdraw successfully!! remaining balance is : "+b);
		}
		else {
			System.out.println("can't withdraw");
		}
	}
}
