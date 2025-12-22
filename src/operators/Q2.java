package operators;

public class Q2 {
	public static void main(String[] args) {
//		restorant bill split system, conditions: total bill, number of people, gst=18%, taks: calculate gst, calculate amount per person
		
		int bill = 2000;
		int n = 4;
		int gst = bill * 18 /100;
		System.out.println("gst of the bill is : "+gst);
		bill+=gst;
		System.out.println("bill per person after gst is : "+ bill/n);
	}
}
