package hasarelationship;
//4.	A BankAccount has a Customer object. The customer details should be initialized immediately when an account is created.
public class Customer {
	private String name;
	private String accNo;
	Customer(String name, String accNo){
		this.name = name;
		this.accNo = accNo;
	}
	public Customer setName(String name) {
		this.name = name;
		return this;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public String getAcc() {
		return accNo;
	}
}
