package array;

public class T11 {
	public static void main(String[] args) {
		int[] arr = {-1,2,3,-4,5,6,10,-13,-5};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
