package oops.encapsulation;

public class T2 {
	private double balance;
	public void deposite(double balance) {
		if(balance>0)
		this.balance += balance;
	}
	public void withdraw(double balance) {
		if(this.balance>=balance) {
			this.balance-=balance;
		}
	}
	public double checkBalance() {
		return this.balance;
	}
	
}
