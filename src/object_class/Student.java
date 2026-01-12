package object_class;

public class Student {
String name;
int sid;
Student(String name, int sid){
	this.name = name;
	this.sid = sid;
	
	
}
public String toString() {
	return sid + " , " + name;
}

public boolean equals(Object o) {
	Student s1 = (Student) o;
	return this.sid==s1.sid && this.name==s1.name;
}

public int hashCode() {
	return sid+name.hashCode();
}
}
