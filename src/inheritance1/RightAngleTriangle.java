package inheritance1;

public class RightAngleTriangle extends Triangle {
RightAngleTriangle(String name, int base, int height){
	super(name,base,height);
}
public static void main(String[] args) {
	RightAngleTriangle r = new RightAngleTriangle("triangle",12,15);
	r.display();
	r.area();
	r.type = "right angle triangle";
	r.display();
}
}
