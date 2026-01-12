package exceptionHandling;

public class Example1 {
	public static void main(String[] args) {
		// try catch with handling
			System.out.println("hii");
			try {
				System.out.println(10/0);
			}
			catch(Exception e) {
				System.out.println("handled.........");
			}
			System.out.println("byeeeee");
		}
			
}
