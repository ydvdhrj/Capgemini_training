package hasarelationship;

public class SchoolMain {
public static void main(String[] args) {
	School s = new School("JNV");
	System.out.println(s.getName());
	System.out.println(s.getPrincipal().getName());
}
}
