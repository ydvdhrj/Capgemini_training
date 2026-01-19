package stack;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateMain {
	
public static void main(String[] args) {
	ArrayList<Chocolate> a = new ArrayList<>();
	a.add(new Chocolate(111, "Dairy Milk", 50));
	a.add(new Chocolate(112, "KitKat", 100));
	a.add(new Chocolate(101, "Amul", 75));
	a.add(new Chocolate(132, "5 Star",55.5));
	for(Chocolate c:a) {
		System.out.println(c);
	}
	System.out.println("-----------------------------");
	Collections.sort(a);
	for(Chocolate c:a) {
		System.out.println(c);
	}
}
}

class Chocolate implements Comparable<Chocolate>{
	int cid;
	String name;
	double price;
	
	Chocolate(int cid, String name, double price){
		this.cid = cid;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return cid + " "+ name + " "+ price;
	}
	
//	override the compareTo
	public int compareTo(Chocolate c) {
		return this.cid-c.cid;
	}
}