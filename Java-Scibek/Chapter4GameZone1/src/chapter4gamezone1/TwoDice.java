package chapter4gamezone1;

import javax.swing.JOptionPane;

public class TwoDice
{
	/**
	 * displays the results of two dice rolls.
	 */
	public static void throwDie()
	{
		Die dieOne = new Die();
		Die dieTwo = new Die();
		JOptionPane.showMessageDialog(null,
				"The first number was " + dieOne.getRolledNumber()
						+ ". The second number was " + dieTwo.getRolledNumber()
						+ ".");
	}

	public static void main(String[] args)
	{
		throwDie();
	}
}
