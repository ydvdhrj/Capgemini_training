package operators;

public class Prob2 {
	public static void main(String[] args) {
//		2.An e-commerce site named Dummykart offers discounts.
//		Conditions:
//		Discount = 20%
//		Discount applied only if:
//		Cart value > 3000
//		User is a premium member
//		Task:
//		Declare variables for price and membership
//		Calculate discount
//		Display:
//		Final amount to pay
//		Discount applied or not
		
		int cart = 3000;
		boolean prem = false;
		
		boolean disc = cart>3000 || prem;
		cart -= disc ? cart*20/100 : 0;
		System.out.println("Final amount to pay : "+cart);
		System.out.println("Discount applied or not : "+disc);

	}
}
