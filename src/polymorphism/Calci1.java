package polymorphism;

public class Calci1 extends Calsi{
public void add() {
	System.out.println(30+50);
}
public static void main(String[] args) {
	Calsi c = new Calci1();
	c.add();
}
}
