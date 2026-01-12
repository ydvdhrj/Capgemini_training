package object_class;

public class StudentDriver {
public static void main(String[] args) {
	Student s1 = new Student("dheeraj",101);
	Student s2 = new Student("dheeraj",101);
	Student s3 = s1;
	System.out.println(s1.equals(s2)); // same values as we are using overriden equals fun to comparison
	System.out.println(s1.equals(s3)); // same reference
	System.out.println(s1==s2); // it is comparing reference
	System.out.println(s1.toString());
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1.hashCode()==s2.hashCode());
	System.out.println(s1.getClass());
	System.out.println(s1.getClass().getModifiers());
	System.out.println(s1.getClass().getName());
	System.out.println(s1.getClass().getSimpleName());
	System.out.println(s1.getClass().getPackageName());
	
}
}
