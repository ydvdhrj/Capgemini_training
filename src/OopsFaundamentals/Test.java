package OopsFaundamentals;

public class Test {
static int a;
public static void main(String[] args) {
	System.out.println(a);//directly call
	System.out.println(Test.a);//using class
	Test t = new Test();
	System.out.println(t.a); // using obj
}
}
