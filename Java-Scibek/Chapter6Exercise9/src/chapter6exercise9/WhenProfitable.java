package chapter6exercise9;

import static betterutils.BetterUtils.*;

public class WhenProfitable
{
	public static void main(String[] args)
	{
		double gross = 20000;
		double expenses = 35000;
		double net = gross - expenses;
		String netType = (net > 0) ? "profit" : "loss";
		println("Year 1\nGross Profit: $%.2f\nExpenses: $%.2f\nNet %s: $%.2f",
				gross, expenses, netType, net);
		for(int i = 2; i <= 20; i++)
		{
			gross *= 1.10;
			expenses *= 1.04;
			net = gross - expenses;
			if(netType.equals("profit"))
			{
				netType = (net > 0) ? "profit" : "loss";
			}
			else
			{
				netType = (net > 0) ? "profit" : "loss";
				if(netType.equals("profit"))
				{
					println("Year %d is the first year a profit was "
							+ "recorded.", i);
				}
			}
			println("Year %d\nGross Profit: $%.2f\nExpenses: $%.2f\nNet "
					+ "%s: $%.2f", i, gross, expenses, netType, net);
		}
	}
}
