package chapter12exercise1;

import static betterutils.BetterUtils.*;
import java.util.Scanner;

public class BadSubscriptCaught
{
	/**
	 * tests some bad stuff
	 */
	public static void testBadStuff()
	{
		String[] firstNameArray =
				{ "Bob", "Preston", "Nick", "Skyler", "Cam", "Luke", "Josh",
						"Greg", "Jonathan", "Tom" };
		Scanner keyboard = new Scanner(System.in);
		int userInt = 0;
		try
		{
			print("Enter a integer to get the name of: ");
			userInt = keyboard.nextInt();
			println(firstNameArray[userInt]);
		}
		catch(Exception e)
		{
			println("Error: that index does not exist.");
		}
		keyboard.close();
	}

	public static void main(String[] args)
	{
		testBadStuff();
	}
}
