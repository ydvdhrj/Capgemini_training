package fileHandling;

import java.io.*;

public class Example {
public static void main(String[] args) throws IOException{
//	create folder using File Class
	File f = new File("C:\\Users\\dheer\\Desktop\\capgemini\\fileHandling");
	f.mkdir();
//	mkdirs() is used to create subfloders (multiple folder chain) in one go
//	File f = new File("C:\\Users\\dheer\\Desktop\\capgemini\\fileHandling\\Handling");
//	f.mkdirs();
//	another way
//	File f1 = new File(f,"Handling");
//	f1.mkdir();
	
	
//	create file using file class
//	File f1	 = new File(f,"Sample.txt");
//	f1.createNewFile();
//	
//	File f2 = new File(f,"Sample2.txt");
//	f2.createNewFile();
//	
//	File f3 = new File(f,"Sample3.java");
//	f3.createNewFile();
//	
//	File[] folder = f.listFiles();
//	if(folder!=null) {
//		for(File f4:folder) {
//			System.out.println(f4.getName());
//		}
//	}
	
//	System.out.println(f.getAbsolutePath());

//	System.out.println(f1.getAbsolutePath());
	
	
	File f1 = new File(f,"Example.java");
	f1.createNewFile();
	
//	to write the data ---> FileWriter
//	FileWriter fw = new FileWriter(f1);
//	fw.write("Hello Guyzz.. welcome to java.");
//	fw.write("\n");
//	fw.write("Bye Byee Guyzzzz.....hehe");
//	fw.close();
	
//	use BufferedWritter() for more efficiency
	BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
	bw.write("class Example{");
	bw.newLine();
	bw.write("int marks = 90;\n");
	bw.write("String name = Dinga;\n");
	bw.write("}");
	
	bw.close();
	
//	to read the data from the file
//	FileReader fr = new FileReader(f1);
//	int read;
//	while((read = fr.read())!=-1) {
//		System.out.print((char)read);
//	}
//	fr.close();
	
	
//	to read the data from the file using the bufferedreader 
	BufferedReader br = new BufferedReader(new FileReader(f1));
//	int read;
//	while((read = br.read())!=-1) {
//		System.out.print((char)read);
//	}
	
//	we can directly read line by line using readLine method
	String reading;
	while((reading = br.readLine())!=null) {
		System.out.println(reading);
	}
	
//	delete the file using delete keyword
	File f3 = new File(f,"Sample3.java");
	f3.delete();
	
}
}
