package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
public static void main(String[] args) {
//	int[] a = {10,21,30,40,53};
//	Arrays.stream(a)
//		.filter(x->x%2==1)
//		.forEach(System.out::println);
	
//	List<Integer> l = Arrays.asList(15,31,21,10,22,33,54);
//	l.stream()
//		.filter(x->(x%3==0&&x%5==0))
//		.forEach(System.out::println);
	

	
	List<String> list = Arrays.asList("ava","python","App","rust","go");
//	print the element start with A
	list.stream()
		.filter(x->x.startsWith("A"))
		.forEach(System.out::println);
	
	list.stream()
		.filter(x->x.startsWith("a"))
		.forEach(System.out::println);
	
	list.stream()
		.filter(x->x.length()>3)
		.forEach(System.out::println);
		
		
}
}
