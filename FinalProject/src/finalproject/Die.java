package finalproject;
// Supporting Class
import java.util.Random; 

public class Die
{
	private int rolledNumber;
	final static int HIGHEST_DIE_VALUE = 6;
	final static int LOWEST_DIE_VALUE = 1;

	/**
	 * assigns random number to rolledNumber
	 */
	public Die()
	{
		Random rand = new Random(); // Implements Random
		this.rolledNumber =
				rand.nextInt((HIGHEST_DIE_VALUE - LOWEST_DIE_VALUE) + 1)
						+ LOWEST_DIE_VALUE;

	}

	/**
	 * gets the random number
	 * @return - the random number rolled
	 */
	public int getRolledNumber()
	{
		return this.rolledNumber;
	}
	
	public void rollDie()
	{
		Random rand = new Random(); // Implements Random
		this.rolledNumber =
				rand.nextInt((HIGHEST_DIE_VALUE - LOWEST_DIE_VALUE) + 1)
						+ LOWEST_DIE_VALUE;
	}
}
