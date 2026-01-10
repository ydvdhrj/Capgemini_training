package polymorphism;

public class Child extends Parent{
static int a = 20;
String name = "child";
 public static void demo() {
	System.out.println("from child demo....");
}
public static void main(String[] args) {
	Parent c = new Child();
	c.demo();
}
void display() {
	
	System.out.println(a);
	System.out.println(name);
	demo(); //child demo
	System.out.println(super.a);
	System.out.println(super.name);
	super.demo(); // parent demo
}
}
