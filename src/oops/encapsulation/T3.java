package oops.encapsulation;
//3.A company wants to ensure employee salary cannot be negative and should not be accessed directly.
public class T3 {
private double salary;
public void setSalary(double salary) {
	if(salary>0) {
		this.salary = salary;
	}
}
public double getSalary() {
	return salary;
}
}
