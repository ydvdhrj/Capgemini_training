package methodChaining;

public class Q1Main {
public static void main(String[] args) {
	Q1 q = new Q1();
	q.setName("clothes")
		.setPrice(1200)
		.setQuantity(2)
		.setDiscount(20);
	System.out.println(q.getName()+"\n"+q.getPrice()+"\n"+q.getQuantity()+"\n"+q.getDiscount());
}
}
