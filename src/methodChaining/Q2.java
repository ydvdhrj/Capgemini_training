package methodChaining;

public class Q2 {
//	2.A school management system allows administrators to create student profiles by setting multiple attributes such as name, age, and class.
	private String name;
	private int age;
	private int Class;
	
	public Q2 setName(String name) {
		this.name = name;
		return this;
	}
	
	public Q2 setAge(int age) {
		this.age = age;
		return this;
	}
	
	public void setClass(int Class) {
		this.Class = Class;
		
	}
	
	public String studentInfo() {
		return String.format("name : %s \nage: %d \nClass : %d",name,age,Class);
	}
}
