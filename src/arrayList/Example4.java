package arrayList;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Example4 {
public static void main(String[] args) {
	ArrayList<Student> a = new ArrayList<>();
	a.add(new Student(101,"smith"));
	a.add(new Student(102,"Alan"));
	a.add(new Student(103,"Roy"));
	a.add(new Student(104,"Peter"));
	a.add(new Student(105,"John"));
	
	System.out.println(a);
	System.out.println("-----------------------");
	ArrayList a1 = new ArrayList();
	a1.add(10);
	a1.add("hii");
	a1.add(23);
	a1.add(10);
	System.out.println(a1.contains(10));
	System.out.println(a1.indexOf(10));
	System.out.println(a1.lastIndexOf(10));
	System.out.println(a1.get(1));
	
	boolean check =false;
	Scanner ss = new Scanner(System.in);
	int i = ss.nextInt();
//	for(Student s:a) {
//		Student demo = (Student)s;
//		if(s.sid==i) {
//			System.out.println(i+" sid is present");
//			check = true;
//			break;
//		}
//	}
	ListIterator l = a.listIterator();
	while(l.hasNext()) {
		Student demo = (Student)l.next();
		if(demo.sid==i) {
			System.out.println(i+" sid is present");
			check = true;
			break;
		}
	}
	if(!check) {
		System.out.println(i+" sid is not present in the arraylist");
	}
	
	
	

}
}
