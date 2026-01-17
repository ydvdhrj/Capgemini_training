package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDriver {
public static void main(String[] args)throws Exception {
	Student s = new Student(101, "Dingiluu");
	
	
//	to convert java obj to byte
	FileOutputStream fs  = new FileOutputStream("student.txt");
	ObjectOutputStream os = new ObjectOutputStream(fs);
	os.writeObject(s);
	os.close();
	fs.close();
	
//	to convert byte to obj
	FileInputStream fis  = new FileInputStream("student.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Student ss = (Student)ois.readObject();
	System.out.println(ss.sid); //101
	System.out.println(ss.sname); //dingiluu
	System.out.println(ss);
}
}
