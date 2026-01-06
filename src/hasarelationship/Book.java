package hasarelationship;
//2.	A Library has Books. All books should be loaded when the library object is created. Implement this in Java(atleast 2-3 books)
public class Book {
	private String name;
	Book(String name){
		this.name = name;
	}
	public String getBook() {
		return name;
	}
}
