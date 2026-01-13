package exceptionHandling;

public class TryMultipleCatchFinally {
	public static void main(String[] args) {
//		parent exception block in catch must be in the last
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
		finally {
			System.out.println("from finallyyy");
		}
		System.out.println("hiiiii");
	}
}
