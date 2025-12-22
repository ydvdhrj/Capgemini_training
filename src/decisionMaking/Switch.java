package decisionMaking;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("give the day name : ");
		String input = s.nextLine();
		switch (input) {
		case "monday":
			System.out.println("Dosa");
			break;
		case "tuesday":
			System.out.println("poha");
			break;
		case "wednesday":
			System.out.println("paratha");
			break;
		case "thursday":
			System.out.println("idli");
			break;
		case "friday":
			System.out.println("samosa");
			break;
		case "saturday":
			System.out.println("kulcha");
			break;
		case "sunday":
			System.out.println("kulcha");
			break;
		default:
			System.out.println("wrong day name.");
		
		}
	}
}
