package OopsFaundamentals;


public class Biryani {
public static void main(String[] args) {
	Biryani b1 = new Biryani();
	Biryani b2 = b1;
	Biryani b3 = b2;
	Biryani b4 = new Biryani();
	System.out.println(b3==b2);
	System.out.println(b3==b4);
}
}
