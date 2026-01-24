package multiThreading;

public class ByeUser extends Thread{
	BankAccount acc;
	ByeUser(BankAccount acc){
		this.acc = acc;
	}
	public void run() {
	//	
		acc.withdraw(1700);
		System.out.println("from byee user runnn");
	}
}
