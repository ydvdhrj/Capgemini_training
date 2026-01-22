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
	
	
	
	List<Integer> list = new ArrayList(Arrays.asList(12,13,20,43,54,10));
	list.add(111);
	System.out.println(list);
	list.sort((a,b)->a-b); //sorting using lamda
	System.out.println(list);
}
}
