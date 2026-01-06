package hasarelationship;

public class ComputerMain {
public static void main(String[] args) {
	Computer c = new Computer("acer aspire 7");
	System.out.println(c.getComp());
	System.out.println(c.getCpu().getCpuName());
	System.out.println(c.getRam().getModel());
}
}
