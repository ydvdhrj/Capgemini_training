package ExceptionHandlingQuestions;

import java.io.FileInputStream;

//3.	Create a Product class with stock quantity.
//Throw OutOfStockException if user tries to buy more than available quantity.


public class Product {
	static int quantity = 200;
public static void main(String[] args) {
	try {
		buy(500);
	}
	catch(OutOfStockException e) {
		System.out.println(e.getMessage());
	}
}
public static void buy(int quan) throws OutOfStockException {

	if(quan<=quantity) {
		System.out.println("you can buy the stock it is available");
	}
	else {
		throw new OutOfStockException("out of stock exception..");
	}
}
}
