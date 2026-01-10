package inheritance1;

public class AnimalDriver {
public static void main(String[] args) {
	Dog d = new Dog();
	Animal a = d; // upcasted
	if(a instanceof Cat) {
		Cat c = (Cat)a;
		c.meow();
	}
	else {
		Dog d2 = (Dog) a;
		d2.bark();
	}
}
}
