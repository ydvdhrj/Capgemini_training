package hasarelationship;

public class LibMain {
public static void main(String[] args) {
	Library l = new Library("the lib");
	System.out.println("library name is : "+l.getName());
	System.out.println("Books inside lib are : ");
	for(int i=0;i<l.getBooks().length;i++) {
		System.out.print(l.getBooks()[i].getBook()+", ");
	}
}
}
