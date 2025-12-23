package loop;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
//		A mobile app sends an OTP.
//	       The user can retry entering OTP until the correct OTP is entered
//	        or 3 attempts are exhausted.

		Scanner s = new Scanner(System.in);
		int otp = 12345;
		int uotp;
		int count=3;
		do {
			System.out.println("enter otp you have "+count--+" attempts left");
			uotp = s.nextInt();
		}while(uotp!=otp && count>0);
	}
}
