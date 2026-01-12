package string;

public class demo {
public static void main(String[] args) {
	String s1 = "cat";
	String s2 = "bat";
	
//	concat()
	System.out.println(s1.concat(s2));
	
//	charAt()
	System.out.println(s1.charAt(2));
	
//	length()
	System.out.println(s1.length());
	
// compareTo()
	System.out.println(s1.compareTo(s2)); // compareTo give +ve int when s1>s2 0 when s1==s2, -ve int when s1<s2
	
//	equals()
	System.out.println(s1.equals(s2)); 
	
//	startsWith()
	System.out.println(s1.startsWith("ca")); // to check the starting of the string it return boolean
	
//	endsWith()
	System.out.println(s1.endsWith("at"));
	
//	toUpperCase()
	System.out.println(s1.toUpperCase());
	
//	toLowerCase()
	String s3 = "EXAMPLE";
	System.out.println(s3.toLowerCase());
	
//	trim()
	String x = "    abcdfsdnfl   ";
	System.out.println(x);
	System.out.println(x.trim());
	
//	split()
	String y = "hello,I,am,dheeraj";
	System.out.println(y.split(",")[0]);
	System.out.println(y.split(",")[1]);
	System.out.println(y.split(",")[2]);
	
//	replace()
	System.out.println(s1.replace('c', 'b'));

	
}
}
