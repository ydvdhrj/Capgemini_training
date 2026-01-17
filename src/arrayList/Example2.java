package arrayList;

import java.util.ArrayList;

public class Example2 {
public static void main(String[] args) {
	ArrayList al1 = new ArrayList();
	al1.add(12);
	al1.add("hello");
	al1.add('a');
	al1.add(true);
	System.err.println(al1);
	
	al1.add(null);
	System.out.println(al1);
	al1.add(5,"dheeraj");
	System.out.println(al1);
	
	al1.remove(1);
	System.out.println(al1);
	al1.removeAll(al1);
	System.out.println(al1);
}
}
