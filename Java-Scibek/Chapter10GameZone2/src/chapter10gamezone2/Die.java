package chapter10gamezone2;

import java.util.Random;

public class Die
{
	protected int rolledNumber;
	protected int highestDieValue = 6;
	protected int lowestDieValue = 1;

	/**
	 * assigns random number to variable rolledNumber
	 */
	public Die()
	{
		Random rand = new Random();
		this.rolledNumber =
				rand.nextInt((highestDieValue - lowestDieValue) + 1)
						+ lowestDieValue;

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
	 * sets a new random number
	 */
	public void setRolledNumber()
	{
		Random rand = new Random();
		this.rolledNumber =
				rand.nextInt((highestDieValue - lowestDieValue) + 1)
						+ lowestDieValue;
	}
}
