package array;

public class T5 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,10};
		int m = Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<m) {
				m = i;
			}
		}
		System.out.println("minimum value is "+m);
		
	}
}
