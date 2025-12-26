package array;

public class T21 {
	public static void main(String[] args) {
		int[] arr = {1,3,2,1,3,1,4,0,5,0,6,5,5,10};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[j]%2==0) {
					int a = arr[i];
					arr[i]=arr[j];
					arr[j] = a;
					break;
				}
			}
		}
		System.out.println("even elements forst then odd");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
