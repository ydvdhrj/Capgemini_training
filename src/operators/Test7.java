package operators;

public class Test7 {
	public static void main(String[] args) {
//		A store checks if the stock quantity is less than 10 or the item is marked as fast-moving, but not discontinued.
//		Use a conditional operator to decide whether to reorder and a compound assignment operator to increase the stock quantity.
		
		int quantity = 5;
		boolean fmoving = false;
		boolean isDisc = true;
		quantity *= !isDisc && (quantity < 10 || fmoving) ? 2 : 1;
		System.out.println(quantity);
	}
}
