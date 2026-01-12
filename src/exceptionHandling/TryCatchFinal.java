package exceptionHandling;

public class TryCatchFinal {
public static void main(String[] args) {
	System.out.println("hiiiiii");
	try {
		System.out.println(10/0);
		System.out.println("from try...");
	}
	catch(NullPointerException e) {
		System.out.println("handled....");
	}
	finally {
		System.out.println("finallyyy...");
	}
	System.out.println("hellooo");
}
}
