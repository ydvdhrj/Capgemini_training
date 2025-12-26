package methods;

import java.util.Scanner;

public class Q2 {
	public static void attendance(String n) {
		System.out.println(n);
	}
	public static void main(String[] args) {
//		2. A teacher wants to display a student’s name when marking attendance.
//		Create a method that accepts student name and prints it.

		Scanner s = new Scanner(System.in);
		String n = s.nextLine();
		attendance(n);
	}
}
