package isARealetionship_inheritance;

public class Derived extends Base{
static {
	System.out.println("child class loaded");
}
static void demo1() {
	System.out.println("from child class...");
}
public static void main(String[] args) {
//	when we call parent member
//	Base.demo();
	
//	call the child member
//	Derived.demo1();
	
//	call the child member first than parent member
	Derived.demo1();
	Base.demo();
}
}
