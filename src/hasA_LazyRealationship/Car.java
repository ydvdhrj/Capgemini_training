package hasA_LazyRealationship;

public class Car {
	private String name;
	private Engine e;
	Car(String name){
		this.name = name;
	}
	public void addEngine(Engine e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	Engine getEngine() {
		return e;
	}
	
}
