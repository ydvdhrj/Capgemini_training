package inheritance1;

public class EmpPerDriver {
public static void main(String[] args) {
	Employee e = new Employee("Dingaa","Banglore",101,"eng");
	Person p = e; // Upcasted scenario
	System.out.println(p.name);
	System.out.println(p.address);
//	System.out.println(p.eid); // cant access as they are child class property

	
//	down casting
	Employee e2 = (Employee) p;
	System.out.println(e2.name);
	System.out.println(e2.address);
	System.out.println(e2.eid);
	System.out.println(e2.role);
}
}
