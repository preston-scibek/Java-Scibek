package chapter5gamezone4;

import javax.swing.JOptionPane;

public class TwoDice2
{
	/**
	 * displays the results of two dice rolls.
	 */
	public static void throwDie()
	{
		Die dieOne = new Die();
		Die dieTwo = new Die();
		int dieOneRolledNumber = dieOne.getRolledNumber();
		int dieTwoRolledNumber = dieTwo.getRolledNumber();
		JOptionPane.showMessageDialog(null,
				"The first number was " + dieOneRolledNumber
						+ ". The second number was " + dieTwoRolledNumber
						+ ".");
		if(dieOneRolledNumber > dieTwoRolledNumber)
		{
			String result = String.format(
					"Number One(%d) was large" + "r than Number Two(%d).",
					dieOneRolledNumber, dieTwoRolledNumber);
			JOptionPane.showMessageDialog(null, result);
		}
		else if(dieOneRolledNumber < dieTwoRolledNumber)
		{
			String result = String.format(
					"Number One(%d) was smalle" + "r than Number Two(%d).",
					dieOneRolledNumber, dieTwoRolledNumber);
			JOptionPane.showMessageDialog(null, result);
		}
		else
		{
			String result =
					String.format("Number One(%d) is" + " Number Two(%d).",
							dieOneRolledNumber, dieTwoRolledNumber);
			JOptionPane.showMessageDialog(null, result);
		}
	}

	public static void main(String[] args)
	{
		throwDie();
	}
}
