package string;

public class Compare_to {
public static void main(String[] args) {
	String s1 = "cat";
	String s2 = "bat";
	System.out.println(s1.compareTo(s2));
	String s3 = "apple";
	String s4 = "apple";
	System.out.println(s3.compareTo(s4));
	String s5 = "act";
	String s6 = "fat";
	System.out.println(s5.compareTo(s6));
	String s7 = "Apple";
	String s8 = "aPPle";
	System.out.println(s7.compareToIgnoreCase(s8));
	
	char[] arr = {'a','p','p','l','e'};
	String c = new String(arr);
	System.out.println(c);
}
}
