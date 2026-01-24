package multiThreading;

public class HaiUser extends Thread {
BankAccount acc;
HaiUser(BankAccount acc){
	this.acc = acc;
}
public void run() {
//	
	acc.withdraw(500);
	System.out.println("from hai user runnn");
}
}
