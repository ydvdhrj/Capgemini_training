package inheritance1;

public class Triangle extends Shape {
int base;
int height;
Triangle(String shape,int base, int height){
	super(shape);
	this.base = base;
	this.height = height;
}
void area() {
	System.out.println(base*height/2);
}
}
