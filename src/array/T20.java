package array;

public class T20 {
	public static void main(String[] args) {
		int[] arr = {1,3,2,1,3,1,4,0,5,0,6,5,5,10};
		int l = arr[arr.length-1];
		for(int i = arr.length-2;i>=0;i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = l;
		System.out.println("array is rotated to right by one place:");
		for( int i:arr) {
			System.out.print(i + " ");
		}
	}
}
