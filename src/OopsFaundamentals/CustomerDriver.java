package OopsFaundamentals;

public class CustomerDriver {
	public static void main(String[] args) {
		Customer c1 = new Customer(101);
		Customer c2 = new Customer(101,"dinga");
		Customer c3 = new Customer(101, "dinga", "punjab");
		System.out.println(c1.cid+" "+c1.cname+" "+c1.address);
		System.out.println(c2.cid+" "+c2.cname+" "+c2.address);
		System.out.println(c3.cid+" "+c3.cname+" "+c3.address);
	}
}
