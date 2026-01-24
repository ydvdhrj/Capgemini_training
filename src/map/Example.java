package map;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Example {
public static void main(String[] args) {
	HashMap<Integer, String> m = new HashMap<>();
	m.put(101, "Dingaa");
	m.put(102, "Tingulu");
	m.put(103, "chingilu");
	m.forEach((k,v) -> System.out.println(k+" "+v));
	
	System.out.println("--------------------------------------------");
	
	List<Integer> list = new ArrayList(Arrays.asList(12,13,20,43,54,10));
	list.add(111);
	System.out.println(list);
//	list.sort((a,b)->a-b); //sorting using lamda
//	System.out.println(list);
	
//	list.removeIf(x->x%2==0);
//	list.replaceAll(x->x*3);
	list.replaceAll(x->x%2==0?0:x);
	System.out.println(list);
	
	System.out.println("--------------------------------------------");
	
	
//	take a string type of list and add 4 elements 
	List<String> l = new ArrayList(Arrays.asList("dinga","dingiiii","tingaa","tingiiii"));
	System.out.println(l);
//	l.replaceAll(x->x.toUpperCase());
	
//	l.replaceAll(x->x.length()>5?x.substring(0,3):x);
	
	l.replaceAll(x->x.replace('a','*'));
	System.out.println(l);
}
}
