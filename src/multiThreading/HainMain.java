package multiThreading;

public class HainMain {
public static void main(String[] args) {
	BankAccount b1 = new BankAccount();
	BankAccount b2 = new BankAccount();
	HaiUser h1=new HaiUser(b1);
	ByeUser h2=new ByeUser(b2);
	h1.start();
	h2.start();

}
}
