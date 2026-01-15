package ExceptionHandlingQuestions;

import java.util.Scanner;

public class User {
static int coupon=12345;
static boolean paymentTimeout = false;
static String address = "jalandhar";
public static void order(int c, String add) throws AddressNotFoundException, PaymentTimeoutException, InvalidCouponException{
	if(coupon!=c) {
		throw new InvalidCouponException("coupon is invalid exception..");
	}
	if(!paymentTimeout) {
		throw new PaymentTimeoutException("Payement gateway timeout exception..");
	}
	if(add != address) {
		throw new AddressNotFoundException("address not found exception...");
	}
	System.out.println("your order is placed successfully");
}

public static void main(String[] args) {
	try {
		order(12345,"jalandhar");
	}
	catch (AddressNotFoundException e) {
		System.out.println(e.getMessage());
	}
	catch (PaymentTimeoutException e) {
		System.out.println(e.getMessage());		
	}
	catch(InvalidCouponException e) {
		System.out.println(e.getMessage());
	}
}
}
