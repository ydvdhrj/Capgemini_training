package string;

public class example {
public static void main(String[] args) {
	String s1 = "hii";
	String s2 = "bye";
	System.out.println(s1==s2); //compare references
	System.out.println(s1.equals(s2)); // compare contents
	String s3 = new String("hii");
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
	String s4 = "hii";
	System.out.println(s1==s4);
	System.out.println(s1.equals(s4));
}
}
