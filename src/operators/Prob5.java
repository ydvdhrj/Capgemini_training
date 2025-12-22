package operators;

public class Prob5 {
	public static void main(String[] args) {
//		5.College attendance rules:
//			Conditions:
//			Total working days = 30
//			Attendance ≥ 25 days → Eligible for exam
//			Task:
//			Declare variables
//			Calculate attendance percentage
//			Display:
//			Eligible / Not Eligible
		
		int attnd = 23;
		float perc = attnd/30.0f * 100;
		System.out.println(attnd>=25 ? "Eligible "+perc+"% attendance.": "Not Eligible "+perc+"% attendance only.");

	}
}
