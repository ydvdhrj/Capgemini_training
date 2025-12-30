package OopsFaundamentals;

public class Example {
public static void demo() {
	System.out.println("from demo...");
}
public static void main(String[] args) {
	demo(); //directly
	Example.demo(); //class name as reference
	Example e = new Example();
	e.demo(); // obj name as reference
}
}
