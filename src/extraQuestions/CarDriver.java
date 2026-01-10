package extraQuestions;

public class CarDriver {
public static void main(String[] args) {
	Wagoner w = new Wagoner();
	w.setIsSedan(false);
	w.setSeats(5);
	System.out.println("wagoner is a sedan : "+w.getIsSedan());
	System.out.println("number of seats in wagoner are : "+w.getSeats());
	w.getMileage();
	
	System.out.println("------------------------------------------------");
	
	HondaCity c= new HondaCity();
	c.setIsSedan(true);
	c.setSeats(5);
	System.out.println("Honda City is a sedan : "+c.getIsSedan());
	System.out.println("number of seats in Honda City are : "+c.getSeats());
	c.getMileage();
	
	System.out.println("------------------------------------------------");

	InnovaCrysta i = new InnovaCrysta();
	i.setIsSedan(false);
	i.setSeats(5);
	System.out.println("InnovaCrysta is a sedan : "+i.getIsSedan());
	System.out.println("number of seats in InnovaCrysta are : "+i.getSeats());
	i.getMileage();
}
}
