package OopsFaundamentals;

public class StaticBookDriver {
public static void main(String[] args) {
	StaticBook b1 = new StaticBook("Harry Potter");
	System.out.println(b1.count);
	StaticBook b2 = new StaticBook("Stranger Things");
	b1.count = 3;
	System.out.println(b2.count);
	StaticBook b3 = new StaticBook("GOT");
	System.out.println(b3.count);
}
}
