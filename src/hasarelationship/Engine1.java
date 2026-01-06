package hasarelationship;
//1.	A Car has an Engine. The engine should be created as soon as a car object is created. Write a Java program to demonstrate this.
public class Engine1 {
	private String type;
	Engine1(String type){
		this.type = type;
	}
	
	public void startEngine() {
		System.out.println("Engine (" + type + ") is starting... Vroom!");
	}
}
