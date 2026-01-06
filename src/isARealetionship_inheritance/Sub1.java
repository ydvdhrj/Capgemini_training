package isARealetionship_inheritance;
//loading process w.r to objects
public class Sub1 extends Super1{
Sub1(){
	this(10);
	System.out.println("from child ....");
}
Sub1(int a){
	
	System.out.println(a);
}
public static void main(String[] args) {
//	create child object
	Sub1 s1 = new Sub1();
	
}
}
