package array;

public class Q6 {
	public static void main(String[] args) {
		int[] arr = {1,3,2,1,3,1,4,0,5,0,6,5,5,10};
		int mx = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i+=2) {
			if(arr[i]>mx) {
				mx = arr[i];
			}
		}
		System.out.println("maximum of even indexed values : "+mx);
				
	}
}
