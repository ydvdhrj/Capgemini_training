package methodChaining;

public class Q1 {
//	1.An e-commerce company is developing a shopping cart system.
//	Customers should be able to add multiple attributes such as product name, price , discount and quantity
	private String name;
	private int price;
	private int discount;
	private int quantity;
	public Q1 setName(String name) {
		this.name = name;
		return this;
	}
	
	public Q1 setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public Q1 setDiscount(int discount) {
		this.discount = discount;
		return this;
	}
	
	public Q1 setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
		
	}
	public int getDiscount() {
		return discount;
		
	}
	public int getQuantity() {
		return quantity;
	}
}
