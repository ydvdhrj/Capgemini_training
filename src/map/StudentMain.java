package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
public static void main(String[] args) {
	List<Student> list = new ArrayList<Student>(Arrays.asList(new Student(1,"dheeraj",70),new Student(2,"santosh",65),new Student(3,"Utkarsh",87)));
	System.out.println(list);
	list.sort((a,b)->a.marks-b.marks);
	System.out.println(list);
}
}
