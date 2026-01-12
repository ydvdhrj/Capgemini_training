package exceptionHandling;

public class Example2 {
public static void main(String[] args) {
//	parent exception block in catch must be in the last
	try {
		System.out.println(10/0);
	}
	catch(NullPointerException e) {
		System.out.println("from catch 1 "+e.getMessage());
	}
	catch(ArithmeticException e) {
		System.out.println("from catch 2 "+e.getMessage());
	}
	catch(Exception e) {
		System.out.println("from catch 3 "+e.getMessage());
	}
	System.out.println("hiiiii");
}
}
