package chapter10exercise6;

import java.util.Random;
import static betterutils.BetterUtils.*;

public class DemoBaseballGame
{
	/**
	 * demos the ball game;
	 */
	public static void demoBallGame()
	{
		BaseballGame redSoxVsOrioles = new BaseballGame("RedSox", "Orioles");
		Random rand = new Random();
		for(int i = 0; i < redSoxVsOrioles.getInnings(); i++)
		{
			redSoxVsOrioles.setCurrentInning(i);
			redSoxVsOrioles.setAwayTeamScore(rand.nextInt((i / 2) + 1), i);
			redSoxVsOrioles.setHomeTeamScore(rand.nextInt((i / 2) + 1), i);
		}
		for(int i = 1; i < redSoxVsOrioles.getInnings() + 1; i++)
		{
			println("Inning %d:\n%s: %d\n%s: %d", i,
					redSoxVsOrioles.getAwayTeam(),
					redSoxVsOrioles.getAwayTeamScore(i - 1),
					redSoxVsOrioles.getHomeTeam(),
					redSoxVsOrioles.getHomeTeamScore(i - 1));
		}
		redSoxVsOrioles.winner();

	}

	public static void main(String[] args)
	{
		demoBallGame();
	}
}
