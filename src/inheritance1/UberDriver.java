package inheritance1;

import java.util.Scanner;

public class UberDriver {
public static void main(String[] args) {
	Uber c;
	Scanner s = new Scanner(System.in);
	System.out.println("select the number 1 for mini, 2 for sedan , 3 for luxury : ");
	int n = s.nextInt();
	if(n==1) {
		c = new Mini();	
		Mini m = (Mini)c;
		System.out.println("price : "+m.price);
	}
	else if(n==2) {
		c = new Sedan();
		Sedan se = (Sedan) c;
		System.out.println("Price : "+se.price);
	}
	else if(n==3) {
		c = new Luxury();
		Luxury l = (Luxury) c;
		System.out.println("Price : "+l.price);
	}
	else {
		System.out.println("wrong number selected");
	}
}
}
