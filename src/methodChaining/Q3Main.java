package methodChaining;

public class Q3Main {
public static void main(String[] args) {
	Q3 m = new Q3();
	m.setBrand("samsung")
		.setPrice(50000)
		.setColor("black")
		.setWarrenty(24);
	
	System.out.println(m.mblInfo());
}
}
