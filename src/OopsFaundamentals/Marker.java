package OopsFaundamentals;

public class Marker {
	Marker(){
		System.out.println("from Marker....");
	}
	public static void main(String[] args) {
		System.out.println("main starts....");
		Marker m = new Marker();
		System.out.println("main ends...");
	}
}
