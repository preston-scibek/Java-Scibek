package chapter11exercise13;

import static betterutils.BetterUtils.println;

public class PoliticalCandidate implements Runner
{
	/**
	 * describes run in terms of a athlete
	 */
	@Override
	public void run()
	{
		println("Run in context of a political candidate means: "
				+ "\nbe a candidate in a political election");

	}
}
