package finalproject;

import java.util.Scanner;

public class DebugAndtest
{
	public static void main(String[] args)
	{
		// RPS works
		// Python works
		// Poker works
		// BlackJack works
		Scanner keyboard = new Scanner(System.in);
		Python.python(keyboard);
		FindCardPairing.findPairing();
		keyboard.nextLine();
		keyboard.close();
	}

}
