package operators;

public class Test3 {
	public static void main(String[] args) {
//		An employee is eligible for a salary increment if their performance rating is greater than 4 or they have more than 5 years of experience,
//		 but they must not be under disciplinary action. use a conditional operator to decide eligibility and a compound assignment to increase the salary.
		
		int salary = 35000;
		int inc = 5000;
		int rating = 5;
		int exp = 4;
		boolean action = true;
		
		boolean isEligible = !action && (rating > 4 || exp > 5);
		
		salary += isEligible ? inc : 0;
		System.out.println(salary);
		
	}
}
