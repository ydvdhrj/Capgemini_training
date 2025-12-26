package array;

public class T10 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,10};
		int even = 0;
		int odd = 0;
		for(int i:arr) {
			if(i%2==0) {
				even+=i;
			}
			else {
				odd+=i;
			}
		}
		System.out.println("sum of even no : "+even+"\nsum of odd no. : "+odd);
	}
}
