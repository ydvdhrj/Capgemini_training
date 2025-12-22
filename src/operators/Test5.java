package operators;

public class Test5 {
	public static void main(String[] args) {
//		A student gets extra time in an exam if they are physically challenged or their attendance is below 60% but approved by the administration. 
//		Use a conditional operator to decide the extra time and a compound assignment operator to add extra minutes to the exam duration.
		
		boolean isChallenged = false;
		int attendance = 70;
		boolean isApproved = true;
		int duration = 60;
		int extra = 10;
		
		duration += (isApproved && (isChallenged || attendance < 60)) ? extra : 0;
		System.out.println(duration);
	}
}
