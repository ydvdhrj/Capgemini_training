package exceptionHandling;

public class InvalidAgeException extends Throwable{
	InvalidAgeException(String msg){
		super(msg);
	}
}
