package methodChaining;

public class Q2Main {
public static void main(String[] args) {
	Q2 s = new Q2();
	s.setName("dheeraj")
		.setAge(17)
		.setClass(10);
	
	String info = s.studentInfo();
	System.out.println(info);
}
}
