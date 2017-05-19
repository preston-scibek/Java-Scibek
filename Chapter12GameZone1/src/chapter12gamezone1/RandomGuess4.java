package chapter12gamezone1;

import java.util.Random;
import java.util.Scanner;
import static betterutils.BetterUtils.*;

public class RandomGuess4
{
	/**
	 * random guess, continues until guesses correctly
	 */
	public static void randGuess()
	{
		Random rand;
		rand = new Random();
		int randomNumber = rand.nextInt(10) + 1;
		Scanner keyboard = new Scanner(System.in);
		boolean error = true;
		int myNumber = 0;
		while(error)
		{
			try
			{
				print("Guess a random number between 1 and 10: ");
				myNumber = keyboard.nextInt();
				error = false;
			}
			catch(Exception e)
			{
				println("You need to enter a number.");
				error = true;
			}
			keyboard.nextLine();
		}
		int myNumberInt = myNumber;
		while(myNumberInt != randomNumber)
		{
			error = true;
			if(myNumberInt > randomNumber)
			{
				println("Your guess was to high.");
			}
			else
			{
				println("Your guess was to low.");
			}
			while(error)
			{
				try
				{
					println("Guess a random number between 1 and 10: ");
					myNumber = keyboard.nextInt();
					error = false;
				}
				catch(Exception e)
				{
					println("You need to enter a number.");
					error = true;
				}
				keyboard.nextLine();
			}
			myNumberInt = myNumber;
		}
		println("You guessed correctly!!!");
		keyboard.close();
	}

	public static void main(String[] args)
	{
		randGuess();
	}
}
