package hasarelationship;

public class BankAccMain {
public static void main(String[] args) {
	BankAccount b = new BankAccount("SBI");
	System.out.println(b.getInfo());
	System.out.println(b.getCustomer().getName());
	System.out.println(b.getCustomer().getAcc());

}
}
