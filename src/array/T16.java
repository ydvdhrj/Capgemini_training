package array;

public class T16 {
	public static void main(String[] args) {
		int[] arr = {1,3,2,1,3,1,4,0,5,0,6,5,5,10};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					arr[i]= arr[i]^arr[j];
					arr[j] = arr[j]^arr[i];
					arr[i] = arr[i]^arr[j];
				}
			}
		}
		System.out.println("array sorted in ascending order:");
		for(int i:arr) {
			 System.out.print(i+" ");
		}
	}
}
