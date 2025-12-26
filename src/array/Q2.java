package array;

public class Q2 {
	public static void main(String[] args) {
//			Seat numbers are stored in two arrays for two buses. Merge them into one list.
		int[] bus1 = {1,3,4,6,8,12};
		int[] bus2 = {2,5,9,11,10,13,15,14};
		int[] arr = new int[bus1.length+bus2.length];
		
		for(int i=0;i<arr.length;i++) {
			if(i<bus1.length) {
				arr[i] = bus1[i];
			}
			else {
				arr[i] = bus2[i-bus1.length];
			}
		}
		System.out.println("merge bus tickets");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
