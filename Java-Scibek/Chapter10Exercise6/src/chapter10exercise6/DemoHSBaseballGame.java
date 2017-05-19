package chapter10exercise6;

import static betterutils.BetterUtils.println;
import java.util.Random;

public class DemoHSBaseballGame
{
	/**
	 * demos the ball game;
	 */
	public static void demoBallGame()
	{
		final int INNINGS = 7;
		HighSchoolBaseballGame northCarollVMannValley =
				new HighSchoolBaseballGame("Panthers", "Mavericks", INNINGS);
		Random rand = new Random();
		for(int i = 0; i < northCarollVMannValley.getInnings(); i++)
		{
			northCarollVMannValley.setCurrentInning(i);
			northCarollVMannValley.setAwayTeamScore(rand.nextInt((i / 2) + 1),
					i);
			northCarollVMannValley.setHomeTeamScore(rand.nextInt((i / 2) + 1),
					i);
		}
		for(int i = 1; i < northCarollVMannValley.getInnings() + 1; i++)
		{
			println("Inning %d:\n%s: %d\n%s: %d", i,
					northCarollVMannValley.getAwayTeam(),
					northCarollVMannValley.getAwayTeamScore(i - 1),
					northCarollVMannValley.getHomeTeam(),
					northCarollVMannValley.getHomeTeamScore(i - 1));
		}
		northCarollVMannValley.winner();
	}

	public static void main(String[] args)
	{
		demoBallGame();
	}
}
