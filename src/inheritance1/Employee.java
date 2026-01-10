package inheritance1;

public class Employee extends Person{
int eid=102;
String role = "emp";
Employee(String name, String address,int eid, String role){
	super(name,address);
	this.eid = eid;
	this.role = role;
}
}
