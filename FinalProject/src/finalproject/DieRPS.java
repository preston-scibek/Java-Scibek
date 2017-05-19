package finalproject;
// Supporting Class
import java.util.Random; 

public class DieRPS
{
	private int rolledNumber;
	final static int HIGHEST_DIE_VALUE = 5;
	final static int LOWEST_DIE_VALUE = 1;

	enum RPS
	{
		RO, PA, SC, LI, SP
	};

	RPS choice;

	/**
	 * assigns random number to variable rolledNumber
	 */
	public DieRPS()
	{
		Random rand = new Random(); // Implements Random
		this.rolledNumber =
				rand.nextInt((HIGHEST_DIE_VALUE - LOWEST_DIE_VALUE) + 1)
						+ LOWEST_DIE_VALUE;
		if(this.rolledNumber == 1) // If Statement
		{
			this.choice = RPS.RO;
		}
		else if(this.rolledNumber == 2)
		{
			this.choice = RPS.PA;
		}
		else if(this.rolledNumber == 3)
		{
			this.choice = RPS.SC;
		}
		else if(this.rolledNumber == 4)
		{
			this.choice = RPS.LI;
		}
		else
		{
			this.choice = RPS.SP;
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
	
	public void rollDie()
	{
		Random rand = new Random();
		this.rolledNumber =
				rand.nextInt((HIGHEST_DIE_VALUE - LOWEST_DIE_VALUE) + 1)
						+ LOWEST_DIE_VALUE;
		if(this.rolledNumber == 1) // If Statement
		{
			this.choice = RPS.RO;
		}
		else if(this.rolledNumber == 2)
		{
			this.choice = RPS.PA;
		}
		else if(this.rolledNumber == 3)
		{
			this.choice = RPS.SC;
		}
		else if(this.rolledNumber == 4)
		{
			this.choice = RPS.LI;
		}
		else
		{
			this.choice = RPS.SP;
		}
	}
}
