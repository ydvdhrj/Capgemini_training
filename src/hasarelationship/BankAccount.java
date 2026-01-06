package hasarelationship;

public class BankAccount {
	private String name;
	private Customer c = new Customer("dheeraj","BHSPY4326321");
	BankAccount(String name){
		this.name = name;
	}
	public String getInfo() {
		return String.format("Bank name : %s\nCustomer name : %s\nBank account number : %s",name,c.getName(),c.getAcc());
	}
	public Customer getCustomer() {
		return c;
	}
	
	
}
