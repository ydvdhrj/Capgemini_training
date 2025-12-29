package OopsFaundamentals;

public class DemoDriver {
public static void main(String[] args) {
	Demo d = new Demo();
	d.display();
	Demo d1 = new Demo();
	d1.display();
	System.out.println(Demo.i);
	System.out.println(d.j);
}
}
