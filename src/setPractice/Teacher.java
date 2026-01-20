package setPractice;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
	int id;
	String name;
	String sub;
	
	Teacher(int id, String name, String sub){
		this.id = id;
		this.name = name;
		this.sub = sub;
	}
	public String toString() {
		return "id : "+id+" name : "+name+" sub : "+sub;
	}
public static void main(String[] args) {
	Set s = new HashSet();
	s.add(10);
	s.add(16);
	s.add(12);
	System.out.println(s);
	s.add(32);
	System.out.println(s);
	s.add(10);
	System.out.println(s);
	s.add(26);
	System.out.println(s);
	s.remove(10);
	System.out.println(s);
	System.out.println(s.contains(18));
	System.out.println(s.contains(16));
	System.out.println(s.hashCode());
	System.out.println(s.isEmpty());
	System.out.println("----------------------");
	for(Object o:s) {
		System.out.println(o);
	}
	s.add("hiii");
	System.out.println(s);
	s.add(0);
	System.out.println(s);
	s.remove(16);
	System.out.println(s);
	
}
}
