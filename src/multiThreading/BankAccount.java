package multiThreading;

public class BankAccount {
int balance = 1300;
synchronized void withdraw(int amount) {
	if(balance>=amount) {
		balance-=amount;
		System.out.println(amount);
	}
	else {
		System.out.println("insufficient balance");
	}
}
}
