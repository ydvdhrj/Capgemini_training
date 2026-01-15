package ExceptionHandlingQuestions;

public class DatabaseConnectionFailsException extends Exception {
	public DatabaseConnectionFailsException(String msg){
		super(msg);
	}
}
