package loop;

public class Q7 {
	public static void main(String[] args) {
//		Print multiplication tables from 3 to 5, each up to 10.
		for(int i=3;i<=5;i++) {
			System.out.println("table of "+i);
			for(int j=1;j<=10;j++) {
				System.out.println(i*j);
			}
		}
	}
}
