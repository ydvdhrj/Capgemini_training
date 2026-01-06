package hasarelationship;

public class carr1 {
	private String name;
	private Engine1 e;
	
	carr1(String name, String e){
		this.name = name;
		this.e = new Engine1(e);
	}
	
	public void startCar() {
		System.out.println("Checking " + name + " systems...");
		e.startEngine();
	}
}
