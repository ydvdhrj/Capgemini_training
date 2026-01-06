package hasarelationship;

public class Car2 {
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

//constructor
Car2(int price){
	this.price = price;
}

//achieve lazy instantiation
Tyre2[] tyres=new Tyre2[2];

}
