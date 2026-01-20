package setPractice;

import java.util.Set;
import java.util.TreeSet;

public class BiryaniMain {
public static void main(String[] args) {
	TreeSet<Biryani> s = new TreeSet<>(new sortByPrice());
	s.add(new Biryani(1,"veg Biryani",120));
	s.add(new Biryani(2,"Hyderabadi Biryani",220));
	s.add(new Biryani(3,"Egg Biryani",150));
	s.add(new Biryani(4,"Chicken Biryani",200));
	s.add(new Biryani(5,"normal Biryani",120));
	
//	System.out.println(s);
	
	for(Biryani b:s) {
		System.out.println(b);
	}
	
	System.out.println("---------------------------------------------------");
	
	TreeSet<Biryani> s1 = new TreeSet<>(new SortById());
	s1.add(new Biryani(1,"veg Biryani",120));
	s1.add(new Biryani(2,"Hyderabadi Biryani",220));
	s1.add(new Biryani(3,"Egg Biryani",150));
	s1.add(new Biryani(4,"Chicken Biryani",200));
	s1.add(new Biryani(5,"normal Biryani",120));
	
//	System.out.println(s1);
	
	for(Biryani b:s1) {
		System.out.println(b);
	}
	
}
}
