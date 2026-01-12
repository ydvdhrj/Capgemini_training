package exceptionHandling;

public class Example {
	public static void main(String[] args) {
		try {			
			System.out.println("hiiii");
			System.out.println("hellooo");
			System.out.println(10/0);
			System.out.println("byeeee");
		}
		catch(Throwable e) {
			System.out.println(e.getMessage()+" exception occured..");
		}
		finally {
			System.out.println("from finalyy block...");
		}
	}
}
