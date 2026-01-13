package exceptionHandling;

public class TryFinally {
public static void main(String[] args) {
//	System.out.println("hii");
//	try {
//		System.out.println(10/0);
//	}
//	finally {
//		System.out.println("from finallyyy");
//	}
//	System.out.println("from outside");
//	
	
	System.out.println("hii");
	try {
		System.out.println("hiiiiiiiiiii");
		try {
			System.out.println(10/0);
		}
//		catch(Exception e) {
//			System.out.println("handled..");
//		}
		finally {
			System.out.println("from inner finallyy");
		}
	}
	finally {
		System.out.println("from outer finallyyy");
	}
	System.out.println("from outside");
}
}
