package Interface;

import abstraction.CalciVers2;

public class CacliVers2 extends BaseCalci implements InterfaceVers2{
public double square(double d) {
	// TODO Auto-generated method stub
	return d*d;
}
public static void main(String[] args) {
	CalciVers2 c = new CalciVers2();
	System.out.println(c.add(12,3));
}
}
