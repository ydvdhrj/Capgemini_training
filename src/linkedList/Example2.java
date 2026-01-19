package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Example2 {
public static void main(String[] args) {
	LinkedList<Student> l1 = new LinkedList();
	l1.add(new Student(101,"smith"));
	l1.add(new Student(102, "vijay"));
	l1.add(new Student(103, "krishna"));
	System.out.println(l1);
	ListIterator li1 = l1.listIterator();
	while(li1.hasNext()) {
		Student ss = (Student) li1.next();
		System.out.println("index : "+l1.indexOf(ss));
		System.out.println("student id : "+ss.getSid());
		System.out.println("student name : "+ss.getName());
	}
	
	System.out.println("----------------------------------");
	
	Scanner s = new Scanner(System.in);
	int id = s.nextInt();
	boolean check = true;
	ListIterator li2 = l1.listIterator();
	while(li2.hasNext()) {
		Student ss = (Student) li2.next();
		if(ss.getSid()==id) {
			System.out.println(id+" of student is present.");
			check = false;
			break;
		}
	}
	if(check) {
		System.out.println(id+" of studnet is not present...");
	}
}
}
