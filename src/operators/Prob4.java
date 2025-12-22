package operators;

public class Prob4 {
	public static void main(String[] args) {
//		4.A telecom company sends alerts.
//		Daily data limit = 2.0 GB
//		Alert when:
//		Usage ≥ 90% of limit
//		Task:
//		Declare data usage variables
//		Calculate percentage used
//		Display:
//		Alert or No Alert
		
		double data = 1.9;
		double used = (data / 2.0)*100;
		System.out.println(used>=90 ? "Alert!!!!!! "+used + "% of data is used.": "No Alert" );

	}
}
