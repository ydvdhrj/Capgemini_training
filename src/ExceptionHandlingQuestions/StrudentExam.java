package ExceptionHandlingQuestions;

//6. A student submits an exam online.
//Failures include:
//•	Internet disconnection
//•	Session timeout
//•	File upload failure


public class StrudentExam {
static boolean internet = true;
static boolean session = true;
static boolean fileUpload = false;

public static void submitExam() throws FileUploadFailureException, SessionTimeoutException, InternetDisconnectionException {
	if(internet==true && session == true && fileUpload==true) {
		System.out.println("your exam is submitted successfully..");
	}
	else if(internet==false) {
		throw new InternetDisconnectionException("your exam is not submitted bcz intrenet is disconnected");
	}
	else if(session==false) {
		throw new SessionTimeoutException("exam is not submitted session timeout exception.");
	}
	else {
		throw new FileUploadFailureException("File upload failure exception occured..");
	}
}
public static void main(String[] args) {
	try {
		submitExam();
	}
	catch(InternetDisconnectionException e) {
		System.out.println(e.getMessage());
	}
	catch(FileUploadFailureException e) {
		System.out.println(e.getMessage());
	}
	catch(SessionTimeoutException e) {
		System.out.println(e.getMessage());
	}
}
}
