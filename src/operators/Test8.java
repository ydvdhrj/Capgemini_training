package operators;

public class Test8 {
	public static void main(String[] args) {
//		A system allows login only if the user name and password are correct and the account is not locked. If the login fails, increase the login attempt
//		.counter using a compound assignment operator and use a conditional operator to lock the account after a certain number of attempts.
		
		int attempts = 6;
		int limit = 6;
		String username = "dheeraj";
		String password = "abcd";
		boolean isLocked = false;
		attempts = !(!isLocked && (username=="dheeraj" && password=="abcd")) ? ++attempts : attempts;
		isLocked = attempts>limit ? true : false;
		System.out.println("account is locked or not : "+isLocked);
	}
}
