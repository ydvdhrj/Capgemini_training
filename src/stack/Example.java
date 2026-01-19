package stack;

import java.util.Stack;

public class Example {
public static void main(String[] args) {
	Stack<Integer> s = new Stack<>();
	s.push(12);
	s.push(23);
	s.push(32);
	System.out.println(s.pop());
	s.push(54);
	System.out.println(s.peek());
	System.out.println(s.isEmpty());
	System.out.println(s);
	
	System.out.println("--------------------"); 
	
	Stack s2 = new Stack();
	Student a1 = new Student(1,"dheeraj");
	Student a2 = new Student(2,"meehir");
	s2.push(a1);
	s2.push(a2);
	s2.push(21);
	s2.push(true);
	s2.push(32.54);
	s2.push(new Student(3,"aditya"));
	System.out.println(s2.search(21));
	System.out.println(s2);
	s2.push(21);
	System.out.println(s2.search(21));
	
}
}

class Student{
	int sid;
	String sname;
	Student(int id,String name){
		sid = id;
		sname = name;
	}
}
