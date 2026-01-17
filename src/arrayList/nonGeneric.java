package arrayList;

import java.util.ArrayList;

public class nonGeneric {
public static void main(String[] args) {
	ArrayList al1 = new ArrayList();
	
	al1.add(120);
	al1.add(21.43);
	al1.add("hhehe");
	al1.add(true);
	
	Student s = new Student(101, "dinga");
	al1.add(s);
	
	al1.add(new Student(102, "dingiii"));
	
	Student s2 = (Student) al1.get(4);
	
	System.out.println(s2.sid);
}
}
