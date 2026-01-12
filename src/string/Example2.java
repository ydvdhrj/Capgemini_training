package string;

public class Example2 {
public static void main(String[] args) {
	String s1 = "hii";
	String s2 = "bye";
	String s3 = s2;
	System.out.println(s2==s3);
	s2 = "hello";
	System.out.println(s2==s3);
}
}
