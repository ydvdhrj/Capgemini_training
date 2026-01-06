package oops.encapsulation;

public class T3Driver {
public static void main(String[] args) {
	T3 t = new T3();
	t.setSalary(250000);
	System.out.println(t.getSalary());
	T3 t2 = new T3();
	t2.setSalary(-120000);
	System.out.println(t2.getSalary());
}
}
