package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example3 {
public static void main(String[] args) {
	ArrayList a = new ArrayList();
	a.add(10);
	a.add(15);
	a.add(22);
	a.add(30);
	
//	iterator only use for forward iteration
	Iterator i = a.iterator();
//	System.out.println(i.next());
//	System.out.println(i.next());
//	System.out.println(i.next());
//	System.out.println(i.next());
//	System.out.println(i.next());
	
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}

	
	ListIterator i2 = a.listIterator();
	while(i2.hasNext()) {
		System.out.println(i2.next());
	}
	System.out.println("--------------------------------------");
	while(i2.hasPrevious()) {
		System.out.println(i2.previous());
	}
	
	System.out.println("------------------------------------");
	ListIterator i3 = a.listIterator(2);
	while(i3.hasPrevious()) {
		System.out.println(i3.previous());
	}
}
}
