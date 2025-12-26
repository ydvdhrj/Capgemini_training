package array;

public class T4 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,10};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
