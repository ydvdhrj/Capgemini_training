package operators;

public class Prob3 {
	public static void main(String[] args) {
//		3.A bank checks loan eligibility.
//		Conditions:
//		Age between 21 and 60
//		Monthly salary ≥ 25,000
//		Credit score ≥ 700
//		Task:
//		Declare all required variables
//		Check eligibility using logical operators
//		Display:
//		Eligible / Not Eligible
		
		int age = 15;
		int salary = 30000;
		int cScore = 800;
		System.out.println(age>21 && age<60 && salary>=25000 && cScore >=700 ? "Eligible" : "Not Eligible");

	}

}
