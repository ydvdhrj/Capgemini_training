package ExceptionHandlingQuestions;

public class SessionTimeoutException extends Exception {
	SessionTimeoutException(String msg){
		super(msg);
	}
}
