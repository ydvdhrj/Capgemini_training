package isARealetionship_inheritance;

public class Student1 extends Person1 {
static String name = "Dinga";
public static void main(String[] args) {
	Student1 s = new Student1();
	s.display();
}
void display() {
	System.out.println(name);
	System.out.println(super.name);
}
}
