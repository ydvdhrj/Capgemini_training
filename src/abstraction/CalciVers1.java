package abstraction;

public class CalciVers1 extends AbstractCalVers1{
double power(double d,double e) {
	return Math.pow(d,e);
}
@Override
int add(int a, int b) {
	// TODO Auto-generated method stub
	return a+b;
}

@Override
int sub(int a, int b) {
	// TODO Auto-generated method stub
	return a-b;
}

@Override
int mul(int a, int b) {
	// TODO Auto-generated method stub
	return a*b;
}

}
