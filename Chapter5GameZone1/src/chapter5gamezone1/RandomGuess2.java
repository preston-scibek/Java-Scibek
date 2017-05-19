package chapter5gamezone1;

import java.util.Random;
import javax.swing.JOptionPane;

public class RandomGuess2
{
	public static void randGuess()
	{
		Random rand;
		rand = new Random();
		int randomNumber = rand.nextInt(10) + 1;
		String myNumber = JOptionPane.showInputDialog(
				"Guess a random number " + "between 1 and 10:");
		int myNumberInt = Integer.parseInt(myNumber);
		JOptionPane.showMessageDialog(null,
				"Your Number is " + myNumberInt + ".");
		JOptionPane.showMessageDialog(null,
				"The Number is " + randomNumber + ".");
		if(myNumberInt == randomNumber)
		{
			JOptionPane.showMessageDialog(null, "You guessed correctly!!!");
		}
		if(myNumberInt > randomNumber)
		{
			JOptionPane.showMessageDialog(null, "Your guess was to high."
					+ " It was " + (myNumberInt - randomNumber) + " off.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your guess was to low."
					+ " It was " + (randomNumber - myNumberInt) + " off");
		}
	}

	public static void main(String[] args)
	{
		randGuess();
	}
}