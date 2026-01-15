package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
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
}
}
