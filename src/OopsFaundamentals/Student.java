package OopsFaundamentals;

public class Student {
	int eid;
	Student(int eid){
		this.eid = eid;
		System.out.println(eid);
	}
	public static void main(String[] args) {
		Student s1 = new Student(101);
		System.out.println(s1.eid);
	}
}
