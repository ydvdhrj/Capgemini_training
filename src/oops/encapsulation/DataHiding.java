package oops.encapsulation;

public class DataHiding {
public static void main(String[] args) {
	Book b = new Book();
	b.setPrice(120);
	System.out.println(b.getPrice());
}
}
