package operators;

public class Prob1 {
	public static void main(String[] args) {
//		A college want to display the student's result.
//		student has 3 subjects, pass marks for each subj=40, total marks=sum of all subj, students is pass only if all subj >=40
//		now display the total marks and also display whether student is pass or fail (use both logical and conditional operator)
		
		int subj1 = 30;
		int subj2 = 60;
		int subj3 = 55;
		boolean isPass = subj1>=40 && subj2>=40 && subj3>=40;
		System.out.println("Total marks of the student : "+ (subj1+subj2+subj3));
		System.out.println("student is passed : "+ isPass);
	}
}
