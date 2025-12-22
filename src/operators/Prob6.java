package operators;

public class Prob6 {
	public static void main(String[] args) {
//		6.A ShopKeeper checks product quality.
//		Conditions:
//		Weight must be between 450 and 550 grams
//		Quality score ≥ 8
//		Task:
//		Declare variables
//		Check product status using logical operators
//		Display:
//		Accepted / Rejected
		
		int weight = 500;
		int score = 7;
		
		System.out.println(weight>450 && weight<550 && score>=8 ? "Accepted" : "Rejected");

	}
}
