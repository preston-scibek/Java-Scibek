package chapter10gamezone2;


public class LoadedDie extends Die
{
	/**
	 * assigns random number to variable rolledNumber
	 */
	public LoadedDie()
	{
		super();
		this.lowestDieValue = 2;
		this.setRolledNumber();
	}
}
