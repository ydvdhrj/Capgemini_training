package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add("hello");
	l1.add(123);
	l1.add(true);
	l1.add(21.54);
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	System.out.println(l1.get(2));
	l1.addFirst(123);
	System.out.println(l1);
	System.out.println("--------------------");
	for(Object o:l1) {
		System.out.println(o);
	}
	System.out.println("-----------------------");
	
	Iterator i = l1.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	System.out.println("---------------------");
	
	ListIterator li = l1.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println("---------------------");
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
	System.out.println("--------------------------");
	ListIterator li2 = l1.listIterator(2);
	while(li2.hasNext()) {
		System.out.println(li2.next());
	}
	System.out.println("----------------------------");
	
	l1.remove(3);
	System.out.println(l1);
	
	
}
}
