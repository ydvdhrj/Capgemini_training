package operators;

public class Test1 {
	public static void main(String[] args) {
//      A program checks a student's marks. If the marks are greater than or equal to 40 and attendance is above 75%,
//      the student passes; otherwise, the student fails.
//      use relational and logical operators to check eligibility, the conditional operator to decide pass or fail,
//      and a compound assignment operator to add 5 bonus marks if the student passes.
		
		int marks = 42;
		int attendance = 80;
		
		boolean res = marks >= 40 && attendance > 75;
		
		marks += res ? 5 : 0 ;
		System.out.println(marks);
	}
}
