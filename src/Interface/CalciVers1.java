package Interface;

public class CalciVers1 extends BaseCalci implements InterfaceVers1 {
public double power(double d, double e) {
	return Math.pow(d, e);
}
public static void main(String[] args) {
	InterfaceVers1 i=new CalciVers1();
}
}
