package operators;

public class Test2 {
	public static void main(String[] args) {
//		Bank account transaction
//		A bank system verifies whether an account balance is greater than zero and account is active.
//		if the condition is true, allow withdrawal; otherwise, deny it. Use a conditional operator to display the message and a compound 
//		assignment operator to deduct the withdrawal amount from the balance.
		
		int balance = 1000;
		boolean active = false;
		int withdrawal = 200;
		
		boolean isAllowed = balance > 0 && active;
		
		balance -= isAllowed ? withdrawal : 0;
		System.out.println(balance);
	}
}
