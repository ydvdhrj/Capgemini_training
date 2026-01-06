package hasA_LazyRealationship;

public class CarMain {
public static void main(String[] args) {
	Car c = new Car("mustang");
	c.addEngine(new Engine("V8"));
	c.addEngine(new Engine("V12"));

	System.out.println(c.getName());
	System.out.println(c.getEngine().getName());

}
}
