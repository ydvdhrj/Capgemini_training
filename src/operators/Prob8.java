package operators;

public class Prob8 {
	public static void main(String[] args) {
//		8.Company Login Validation
//		Conditions:
//		Username correct
//		Password correct
//		OTP verified
//		Task:
//		Declare boolean variables
//		Validate login using logical operators
//		Display:
//		Login Success / Login Failed
		
		boolean isUsername = true;
		boolean isPassword = false;
		boolean isOtp = true;
		
		System.out.println(isUsername && isPassword && isOtp ? "Login Success.": "Login Failed.");

	}
}
