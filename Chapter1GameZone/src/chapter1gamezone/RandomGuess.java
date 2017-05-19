package chapter1gamezone;

import javax.swing.JOptionPane;
import java.util.Random;

public class RandomGuess
{
	public static void main(String[] args)
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
			JOptionPane.showMessageDialog(null,
					"Your guess was " + (myNumberInt - randomNumber) + " off.");
		}
		else
		{
			JOptionPane.showMessageDialog(null,
					"Your guess was " + (randomNumber - myNumberInt) + " off");
		}
	}
}
