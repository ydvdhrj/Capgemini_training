package OopsFaundamentals;

public class Customer {
	int cid;
	String cname;
	String address;
	Customer(int cid){
		this.cid = cid;
	}
	Customer(int cid,String cname){
//		this.cid = cid;
		this(cid);
		this.cname = cname;
	}
	Customer(int cid, String cname, String address){
//		this.cid = cid;
//		this.cname = cname;
		this(cid,cname);
		this.address = address;
	}
	
}
