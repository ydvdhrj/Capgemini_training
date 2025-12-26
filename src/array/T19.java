package array;

public class T19 {
	public static void main(String[] args) {
		int[] arr = {1,3,2,1,3,1,4,0,5,0,6,5,5,10};
		int f = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = f;
		System.out.println("array is rotated by 1 left");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
