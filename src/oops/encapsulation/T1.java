package oops.encapsulation;

public class T1 {
//	1.A school wants to store a student’s marks. The marks should not be accessed directly. They must only be changed using methods.
	private int marks;
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return this.marks;
	}
}
