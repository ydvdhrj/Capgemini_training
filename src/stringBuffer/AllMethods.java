package stringBuffer;

public class AllMethods {
	public static void main(String[] args) {
		//StringBuffer Methods
		
//		capacity()
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity()); //initial capacity will be 16
		s.append("hello Dheeraj ya");
		System.out.println(s);
		s.append('i');
		System.out.println(s.capacity()); // if we add more then the capacity then capacity increased by this formula current capacity * 2 + 2;
		System.out.println(s);
		StringBuffer s2 = new StringBuffer(17);
		s2.append("hello Dheeraj yad");
		System.out.println(s2.capacity()); //capacity will be the provided capacity here it is 17
		System.out.println(s2);
		s2.append('a');
		System.out.println(s2.capacity());
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("hello"); 
		System.out.println(s3.capacity()); // capacity will be string.length() + 16
		System.out.println(s3);
		
//		length()
		System.out.println(s.length()); // length is number of character it is currently holding
		System.out.println(s2.length());
		System.out.println(s3.length());
		
//		append()
//		in string buffer you can append any type of data
		StringBuffer s4 = new StringBuffer("hii");
		s4.append(1);
		System.out.println(s4);
		s4.append(true);
		System.out.println(s4);
		s4.append(4.5);
		System.out.println(s4);
		s4.append('a');
		System.out.println(s4);
		s4.append("hehe");
		System.out.println(s4);
		
		
//		insert()
		StringBuffer s5 = new StringBuffer();
		s5.insert(0,'a');
		System.out.println(s5);
//		reverse()
//		charAt()
//		indexOf()
//		lastIndexOf()
//		delete()
//		deleteCharAt()
//		replace()
//		setCharAt()
	}
}
