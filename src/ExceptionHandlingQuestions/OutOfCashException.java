package ExceptionHandlingQuestions;

public class OutOfCashException extends Exception {
	OutOfCashException(String msg){
		super(msg);
	}
}
