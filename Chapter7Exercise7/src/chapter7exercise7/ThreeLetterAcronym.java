package chapter7exercise7;

import java.util.Scanner;

public class ThreeLetterAcronym
{
	/**
	 * prints the TLA for the three user inputed words
	 * @param wordOne - first word of acronym
	 * @param wordTwo - second word of acronym
	 * @param wordThree - third word of acronym
	 */
	public static void aGM(String wordOne, String wordTwo, String wordThree)
	{
		char firstLetterOne = wordOne.charAt(0);
		char firstLetterTwo = wordTwo.charAt(0);
		char firstLetterThree = wordThree.charAt(0);
		StringBuilder tLA = new StringBuilder();
		tLA.append(firstLetterOne + "" + firstLetterTwo + firstLetterThree);
		System.out.printf("Your TLA for %s %s %s is %s.\n", wordOne, wordTwo,
				wordThree, tLA);
	}

	public static void main(String[] args)
	{
		Scanner tLAKeyboard = new Scanner(System.in);
		String wordOne;
		String wordTwo;
		String wordThree;
		System.out.print("Enter the first word in the TLA: ");
		wordOne = tLAKeyboard.nextLine();
		System.out.print("\nEnter the second word in the TLA: ");
		wordTwo = tLAKeyboard.nextLine();
		System.out.print("\nEnter the third word in the TLA: ");
		wordThree = tLAKeyboard.nextLine();
		tLAKeyboard.close();
		aGM(wordOne, wordTwo, wordThree);
	}
}
