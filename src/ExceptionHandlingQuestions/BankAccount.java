package ExceptionHandlingQuestions;

public class BankAccount {
static int balance;
public static void main(String[] args) {
	
	balance = 200;
	try {
		withdraw(300);
		
	}catch(InsufficientBalanceException e) {
		System.out.println(e.getMessage());
	}
}
public static void withdraw(int amount) throws InsufficientBalanceException{
	if(amount <= balance) {
		balance -= amount;
		System.out.println("withdrawal is done");
	}
	else {
		throw new InsufficientBalanceException("Insufficient balance");
	}
}
}
