package operators;

public class Q4 {
	public static void main(String[] args) {
//		Insurance premium decision, condition: age>=25, no smoking, no drinking, health score>=8, task: check eligibility, display premium applicable or not
		
		int age = 30;
		boolean smoking = false;
		boolean drinking = false;
		int hscore = 9;
		
		boolean elig = age>=25 && !smoking && !drinking && hscore>=8;
		System.out.println(elig?"premium is applicable": "premium is not applicable");
	}
}
