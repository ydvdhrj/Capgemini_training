package multiThreading;

public class Example implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is about to runnn..........");
		System.out.println(Thread.currentThread().getName());
		
	}

}
