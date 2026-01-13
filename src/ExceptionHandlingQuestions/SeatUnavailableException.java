package ExceptionHandlingQuestions;

public class SeatUnavailableException extends RuntimeException{
	SeatUnavailableException(String msg){
		super(msg);
	}
}
