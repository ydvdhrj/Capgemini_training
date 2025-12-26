package array;

public class T14 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,0,4,5,0,6,10};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
			else {
				arr[i-count] = arr[i];
			}
		}
		for(int i=arr.length-1;i>arr.length-count;i--) {
			arr[i]=0;
		}
		System.out.println("all the zero moved to last");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
