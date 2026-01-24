package map;

public class Student {
int sid;
String sname;
int marks;
Student(int sid,String sname, int marks){
	this.sid = sid;
	this.sname = sname;
	this.marks = marks;
}
public String toString() {
	return "sid : "+sid+" name : "+sname+" marks : "+marks;
}
}
