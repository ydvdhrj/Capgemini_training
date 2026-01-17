package arrayList;

import java.util.ArrayList;

public class Example {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	Example e = new Example();
	a.add(10);
	a.add('a');
	a.add("hello");
	a.add(12.5);
	a.add(e);
	a.add(true);
	System.out.println(a);
	
	ArrayList a2 = new ArrayList();
	a2.addAll(a); //adding  collection a to a2
	System.out.println(a2);
	
	a2.add(3,"helluuu");
	System.out.println(a2);
//	with index
	a2.add(0,a);
	System.out.println(a2);
	
	a2.addAll(1,a);
	System.out.println(a2);
}
}
