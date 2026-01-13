package ExceptionHandlingQuestions;

public class FileUploadFailureException extends Exception {
	FileUploadFailureException(String msg){
		super(msg);
	}
}
