package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Example2 {
	String name;
static void square(int a) {
	System.out.println(a*a);
}
int add(int a,int b) {
	return a+b;
}
void display(int s) {
	System.out.println(s);
}

Example2(){
	System.out.println("heloo from no arg constructor");
}
Example2(String name){
	this.name = name;
	System.out.println(name);
}

public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>(Arrays.asList(12,14,10));
//	list.forEach(x->square(x));
	
//	static method using method ref
	list.forEach(Example2::square);
	
//	create object
	Example2 e = new Example2();
	list.forEach(e::display);
	
//	creating obj for no arg constructor
	Supplier<Example2> s = Example2::new;
	s.get();
	
	
//	creating obj for parameterized
	Function<String, Example2> f=Example2::new;
	f.apply("Dingaa");
}

}
