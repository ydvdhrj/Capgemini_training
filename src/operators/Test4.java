package operators;

public class Test4 {
	public static void main(String[] args) {
//		An online store gives a discount if the total purchase amount is above 2000 and the user is premium member, or if the user is not a first-time customer.
//		Use logical and relational operators to check conditions, the conditional operator to calculate the final price, and a compound assignment operator to reduce the bill amount.
		
		int purchase = 3000;
		boolean isPremium = false;
		boolean fTime = true;
		int discount = 200;
		
		purchase -= (!fTime || (purchase > 2000 && isPremium)) ? discount : 0;
		System.out.println(purchase);
	}
}
