package ExceptionHandlingQuestions;

//5.An ATM system allows users to withdraw cash.
//Possible failures:
//•	Insufficient balance
//•	Invalid PIN
//•	ATM out of cash


public class ATM {
static int cash = 20000;
int pin;
int balance;
ATM(int pin, int balance){
	this.pin = pin;
	this.balance = balance;
}
void withdraw(int pin, int amount) throws OutOfCashException, InvalidPINException, InsufficientBalanceException{
	if(this.cash>0) {
		if(this.pin==pin) {
			if(amount<=this.balance) {
				System.out.println("your withdrawal transaction is completed collect your money");
			}
			else {
				throw new InsufficientBalanceException("you balance is insufficient..");
			}
		}
		else {
			throw new InvalidPINException("your atm pin is invalid try again..");
		}
	}
	else {
		throw new OutOfCashException("ATM has no cash left out of cash exception...");
	}
}
public static void main(String[] args) {
//	cash = 0;
	ATM a = new ATM(123456,500);
	try {
		a.withdraw(123456, 400);
	}
	catch(OutOfCashException e) {
		System.out.println(e.getMessage());
	}
	catch(InvalidPINException e) {
		System.out.println(e.getMessage());
	}
	catch(InsufficientBalanceException e) {
		System.out.println(e.getMessage());
	}
}
}
