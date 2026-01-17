package arrayList;

import java.util.ArrayList;

public class GenericExample {
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<>();
	
	a1.add(121);
	a1.add(11);
	a1.add(12321);
	a1.add(12);
	a1.add(101);
	System.out.println(a1);
	
	ArrayList<String> a2 = new ArrayList<>();
	a2.add("red");
	a2.add("Green");
	a2.add("blue");
	a2.add("beige");
	System.out.println(a2);
	
	for(String s:a2) {
		System.out.println(s);
	}

}
}
