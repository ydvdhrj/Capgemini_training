package ExceptionHandlingQuestions;

public class InvalidPINException extends Exception {
	InvalidPINException(String msg){
		super(msg);
	}
}
