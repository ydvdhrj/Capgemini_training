package operators;

public class Test9 {
	public static void main(String[] args) {
//		An electricity board checks if the units consumed are greater than 300 or the user is a commercial customer. Use logical and relational operators
//		to decide the billing rate, the conditional operator to calculate the bill, and a compound assignment operator to add tax to the total amount.
		
		int unit = 300;
		boolean isComm = false;
		int rate  = unit>300 || isComm ? 10 : 0;
		int bill  = unit* rate;
		int tax = bill*30/100;
		bill += tax;
		System.out.println(bill);
		
		
	}
}
