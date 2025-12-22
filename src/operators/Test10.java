package operators;

public class Test10 {
	public static void main(String[] args) {
//		In a game, a player earns bonus points if their score is greater than 100 and they complete the level within the given time,
//		but not if they used cheats. Use a conditional operator to decide bonus eligibility and a compound assignment operator to update the player's score.
		
		int score = 90;
		int time = 50;
		int gTime = 60;
		boolean isCheat = false;
		int bonus = 10;
		
		score += !isCheat && (score > 100 && time < gTime) ? bonus : 0;
		System.out.println(score);
	}
}
