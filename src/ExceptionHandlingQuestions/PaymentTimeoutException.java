package ExceptionHandlingQuestions;

public class PaymentTimeoutException extends Exception {
public PaymentTimeoutException(String msg) {
	super(msg);
}
}
