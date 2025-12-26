package array;

public class T12 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,10};
		int sum = 0;
		for(int i:arr) {
			sum+=i;
		}
		double avg = (double)sum/arr.length;
		System.out.println("avg of an arr : "+avg);
	}
}
