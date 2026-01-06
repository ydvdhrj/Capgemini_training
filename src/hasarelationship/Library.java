package hasarelationship;

public class Library {
	private String libName;
	private Book[] books = {new Book("Silence"), new Book("Grass"), new Book("pursuit of happiness")};
	public void setName(String libName) {
		this.libName = libName;
	}
	public Book[] getBooks() {
		return books;
	}
	Library(String libName){
		this.libName = libName;
	}
	public String getName() {
		return libName;
	}
	
	
}
