package hasarelationship;

public class School {
	private String name;
	private Principal p = new Principal("Mohan Lal");
	School(String name){
		this.name = name;
	}
	public Principal getPrincipal() {
		return p;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
