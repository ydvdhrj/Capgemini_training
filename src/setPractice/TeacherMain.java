package setPractice;

import java.util.HashSet;
import java.util.Set;

public class TeacherMain {
public static void main(String[] args) {
	Set<Teacher> s = new HashSet<Teacher>();
	s.add(new Teacher(101,"Dingaa","Java"));
	s.add(new Teacher(102,"Dingiii","Python"));
	s.add(new Teacher(103,"dheeraj","c++"));
	System.out.println(s);
	for(Teacher t:s) {
		System.out.println(t);
	}
	s.removeIf(t -> t.id==102);
	System.out.println(s);
}
}
