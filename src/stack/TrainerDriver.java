package stack;

import java.util.ArrayList;
import java.util.Collections;

public class TrainerDriver {
public static void main(String[] args) {
	ArrayList<Trainer> a = new ArrayList<>();
	a.add(new Trainer(404,"Harika", "Java"));
	a.add(new Trainer(427,"Kavya", "SQL"));
	a.add(new Trainer(414,"Amruta", "Selenium"));
	a.add(new Trainer(401,"Shradha", "J2EE"));
	a.add(new Trainer(404,"Abhishek",".net"));
	
	for(Trainer t:a) {
		System.out.println(t);
	}
	System.out.println("----------------------");
	System.out.println("--------after sorting by id ..............");
	Collections.sort(a,new SortById());
	for(Trainer t:a) {
		System.out.println(t);
	}
	
	System.out.println("-------after sorting by name--------------");
	Collections.sort(a,new SortByName());
	for(Trainer t:a) {
		System.out.println(t);
	}
}
}
