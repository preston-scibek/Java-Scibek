package chapter10exercise6;

import static betterutils.BetterUtils.println;
import java.util.Random;

public class DemoLLBaseballGame
{
	/**
	 * demos the ball game;
	 */
	public static void demoBallGame()
	{
		final int INNINGS = 6;
		HighSchoolBaseballGame littleBBall =
				new HighSchoolBaseballGame("Bolts", "Pickles", INNINGS);
		Random rand = new Random();
		for(int i = 0; i < littleBBall.getInnings(); i++)
		{
			littleBBall.setCurrentInning(i);
			littleBBall.setAwayTeamScore(rand.nextInt((i / 2) + 1), i);
			littleBBall.setHomeTeamScore(rand.nextInt((i / 2) + 1), i);
		}
		for(int i = 1; i < littleBBall.getInnings() + 1; i++)
		{
			println("Inning %d:\n%s: %d\n%s: %d", i, littleBBall.getAwayTeam(),
					littleBBall.getAwayTeamScore(i - 1),
					littleBBall.getHomeTeam(),
					littleBBall.getHomeTeamScore(i - 1));
		}
		littleBBall.winner();
	}

	public static void main(String[] args)
	{
		demoBallGame();
	}
}
