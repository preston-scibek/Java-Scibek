package chapter11exercise13;

import static betterutils.BetterUtils.println;

public class Athlete implements Runner
{
	/**
	 * describes run in terms of a athlete
	 */
	@Override
	public void run()
	{
		println("Run in context of an athlete means: "
				+ "\nmove at a speed faster than a walk,"
				+ " never having both or all the feet on the"
				+ " ground at the same time");

	}
}
