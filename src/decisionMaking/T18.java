package decisionMaking;

import java.util.Scanner;

public class T18 {
	public static void main(String[] args) {
//		18. User selects a menu item number.
//		Display the selected food item and its price.

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("poha, price:50rs");
			break;
		case 2:
			System.out.println("dosa, price 80rs");
			break;
		case 3:
			System.out.println("paratha, price 40rs");
			break;
		default:
			System.out.println("invalid item number");
		}
	}
}
