package chapter9gamezone4;

import java.util.Random;

public class Die
{
	private int rolledNumber;
	final static int HIGHEST_DIE_VALUE = 3;
	final static int LOWEST_DIE_VALUE = 1;

	enum RPS
	{
		RO, PA, SC
	};

	RPS choice;

	/**
	 * assigns random number to variable rolledNumber
	 */
	public Die()
	{
		Random rand = new Random();
		this.rolledNumber =
				rand.nextInt((HIGHEST_DIE_VALUE - LOWEST_DIE_VALUE) + 1)
						+ LOWEST_DIE_VALUE;
		if(this.rolledNumber == 1)
		{
			choice = RPS.RO;
		}
		if(this.rolledNumber == 2)
		{
			choice = RPS.PA;
		}
		if(this.rolledNumber == 3)
		{
			choice = RPS.SC;
		}

	}

	/**
	 * gets the random number
	 * @return - the random number rolled
	 */
	public int getRolledNumber()
	{
		return this.rolledNumber;
	}

	/**
	 * gets the choice
	 * @return - the choice
	 */
	public RPS getChoice()
	{
		return this.choice;
	}
}
