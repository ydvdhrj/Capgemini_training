package operators;

public class Test6 {
	public static void main(String[] args) {
//		A traffic system checks if a vehicle's speed is greater than the speed limit and the driver is not an emergency service provider. Use a conditional operator to decide whether a fine
//		should be applied and a compound assignment operator to add the fine amount to the total penalty.
		
		int speed = 90;
		int slimit = 80;
		boolean edriver = false;
		int penalty = 200;
		int fine = 500;
		
		penalty += (!edriver && speed > slimit) ? fine : 0;
		System.out.println(penalty);
	}
}
