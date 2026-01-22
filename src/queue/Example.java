package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example {
public static void main(String[] args) {
	Queue q = new LinkedList();
	q.add(12);
	q.add(13);
	q.add(1);
	q.add(11);
	System.out.println(q);
	System.out.println(q.peek());
	q.poll();
	System.out.println(q);
	q.offer(20);
	System.out.println(q);
	q.remove(1);
	System.out.println(q);
	System.out.println(q.element());
	
}
}
