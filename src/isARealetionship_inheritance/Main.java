package isARealetionship_inheritance;

public class Main {
public static void main(String[] args) {
//	w.r to parent classname
	Super.demo(); // parent static member fun
//	Super.test(); //	parent non static
//	Super.subdemo(); // child static using parent
//	Super.subtest(); //child non static using parent
	System.out.println("*****************************************");
	
//	w.r. to child class
	Sub.demo(); // parent class static member fun using child
//	Sub.test(); //parent non static using child
	Sub.subdemo(); // static child fun using child class
//	Sub.subtest(); // non static child using child class
	
	System.out.println("*********************************************");
	
//	w.r. to parent class object
	Super s = new Super();
	s.demo(); // parent static
	s.test(); // parent non static
//	s.subdemo(); // child static
//	s.subtest(); // child non static
	
	System.out.println("***************************************");
	
//	w.r. to child class object
	Sub s2 = new Sub(); 
	s2.demo(); //parent static
	s2.test(); //parent non static
	s2.subdemo(); // child static
	s2.subtest(); // child non static
	
}
}
