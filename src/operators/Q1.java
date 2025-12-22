package operators;

public class Q1 {
	public static void main(String[] args) {
//		scholarship eligibility conditions: marks>=85%, family income < 3,00,000, sports quota or NCC certificate
//		Task: check eligibility using logical operators
		
		int marks = 90;
		int income = 250000;
		boolean sports = false;
		boolean ncc = false;
		
		System.out.println(marks>=85 && income<300000 && (sports || ncc) ? "Eligible" : "Not Eligible");
	}
}
