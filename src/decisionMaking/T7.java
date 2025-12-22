package decisionMaking;

public class T7 {
	public static void main(String[] args) {
//		print the largest of 3 numbers
		int a=10;
		int b=14;
		int c=21;
		
		int max;
		if(a>b) {
			if(a>c) {
				max = a;
			}
			else
				max = c;
		}
		else {
			if(b>c)
				max = b;
			else
				max=c;
		}
		System.out.println(max);
	}
}
