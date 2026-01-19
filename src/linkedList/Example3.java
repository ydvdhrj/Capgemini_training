package linkedList;

import java.util.LinkedList;

public class Example3 {
public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	
	Employee e1 = new Employee(101,"dinga");
	l1.add(e1);
	Employee e2 = new Employee(102,"dingii");
	l1.add(e2);
	Employee e3 = new Employee(103,"raju");
	l1.add(e3);
	Employee e4 = new Employee(104,"neha");
	l1.add(e4);
	System.out.println(l1);
	
	int id = 102;
	l1.removeIf(e->((Employee)e).eid==id);
	System.out.println(l1);
}
}
