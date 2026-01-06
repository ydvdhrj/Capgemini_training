package methodChaining;

public class Q3 {
//	3. A mobile company allows customers to customize phones before purchasing by choosing brand,price , color, and warranty.
	
	private String brand;
	private int price;
	private String color;
	private int warranty;
	
	public Q3 setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public Q3 setPrice(int price) {
		this.price = price;
		return this;
	}
	public Q3 setColor(String color) {
		this.color = color;
		return this;
	}
	public void setWarrenty(int warranty) {
		this.warranty = warranty;
	}
	
	public String mblInfo() {
		return String.format("brand name : %s\nprice : %d\ncolor : %s\nwarrant in months : %d",brand,price,color,warranty);
	}
}
