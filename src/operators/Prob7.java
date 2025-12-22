package operators;

public class Prob7 {
	public static void main(String[] args) {
//		7.A Movie Theatre named XYZ gives discounts for Cinema Tickets.
//		Conditions:
//		Ticket price = 250
//		Discount of 30% if:
//		Age < 12 OR Age > 60
//		Task:
//		Declare variables
//		Calculate discounted price
//		Display final ticket price
		
		int age = 70;
		int price = 250;
		int disc = age<12 || age>60 ? price*30/100 : 0;
		price-=disc;
		System.out.println("Discount rs : "+disc);;
		System.out.println("final ticket price : "+price);

	}
}
