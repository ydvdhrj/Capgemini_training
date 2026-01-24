package streams;

public class Employee {
// create a employee class with 3 attrubutes eid, ename and sal. make them private and give setters and getters print the emp names whose salary is > 25000 using streams
	private int eid;
	private String ename;
	private int sal;
	
	public int getId() {
		return eid;
	}
	public void setId(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return ename;
	}
	public void setName(String name) {
		ename = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	Employee(int eid, String ename, int sal){
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	
	
}
