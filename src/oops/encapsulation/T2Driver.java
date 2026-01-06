package oops.encapsulation;

public class T2Driver {
public static void main(String[] args) {
	T2 t = new T2();
	t.deposite(2000);
	System.out.println(t.checkBalance());
	t.withdraw(1200);
	System.out.println(t.checkBalance());
}
}
