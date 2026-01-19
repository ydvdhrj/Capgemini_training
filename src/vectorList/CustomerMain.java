package vectorList;

import java.util.Scanner;
import java.util.Vector;

public class CustomerMain {
public static void main(String[] args) {
	Customer c1 = new Customer(1,"dheeraj","Indore");
	Customer c2 = new Customer(2,"ajay","bhopal");
	Customer c3 = new Customer(3,"sameer","delhi");
	Customer c4 = new Customer(4,"shivam","gwalior");
	Customer c5 = new Customer(5,"pranav","pune");
	Vector<Customer> v = new Vector<>();
	v.add(c1);
	v.add(c2);
	v.add(c3);
	v.add(c4);
	v.add(c5);
	Scanner s = new Scanner(System.in);
	System.out.println("enter the name : ");
	String name = s.nextLine();
	for(Customer c:v) {
		if(c.cname.equals(name)) {
			System.out.println("cid : "+c.cid+"\nname : "+c.cname+"\naddress : "+c.caddress);
		}
	}
	System.out.println("enter the cid to remove the customer");
	int id = s.nextInt();
	v.removeIf(c->c.cid==id);
	for(Customer c:v) {
		System.out.println("cid : "+c.cid+"\nname : "+c.cname+"\naddress : "+c.caddress);
	}
}
}

class Customer{
	int cid;
	String cname;
	String caddress;
	Customer(int cid, String cname, String caddress){
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		
	}
}