package finalproject;

import static betterutils.BetterUtils.*;

public abstract class MiniGame
{
	/**
	 * prints the winner
	 */
	public void winner()
	{
		println("YOU ARE THE WINNER CONGRATULATIONS");
	}

	/**
	 * prints the loser
	 */
	public void loser()
	{
		println("YOU ARE THE LOSER HAHAHAHAHAH");
	}

	/**
	 * prints the rules
	 */
	public abstract void rules();
}
