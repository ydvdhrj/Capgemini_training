package fileHandling;

import java.io.Serializable;

public class Student implements Serializable{
int sid;
String sname;
Student(int sid, String sname){
	this.sid = sid;
	this.sname = sname;
}
}
