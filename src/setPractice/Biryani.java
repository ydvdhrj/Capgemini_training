package setPractice;

import java.util.Comparator;

public class Biryani {
	int bid;
	String type;
	int price;
	Biryani(int bid, String type, int price){
		this.bid = bid;
		this.type = type;
		this.price = price;
	}
	public String toString() {
		return "bid : "+bid+" type : "+type+" price : "+price;
	}
	
	
//	I have implement the method of comparable 
//	@Override
//	public int compareTo(Biryani o) {
//		// TODO Auto-generated method stub
//		if(this.price==o.price) {
//			return this.type.compareTo(o.type);
//		}
//		return this.price-o.price;
//	}
}
