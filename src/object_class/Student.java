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
}
