package operators;

public class Q3 {
	public static void main(String[] args) {
//		smart traffic fine system, conditions: speed limit = 60kmh fine if: speed > limit and seat belt not worn, task: declare variables display fine amount or safe driving
		
		int speed = 70;
		boolean belt = false;
		int fine = 500;
		
		System.out.println(speed>60 && !belt ? "fine for not wearing seat belt is rs "+ fine : " no fine" );
	}
}
