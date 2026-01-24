package multiThreading;

public class ExampleMain {
public static void main(String[] args) throws InterruptedException{
	Example e1 = new Example();
	Example e2 = new Example();
	Thread t = new Thread(e1);
	Thread t2 = new Thread(e2);
//	t.run();
	t.start();
	t.join();
	t.sleep(1000);
	System.out.println("hellooooo");
	t2.start();
}
}
