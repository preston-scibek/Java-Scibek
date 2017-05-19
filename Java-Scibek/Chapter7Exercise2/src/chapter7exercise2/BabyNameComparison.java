package chapter7exercise2;

import java.util.Scanner;

public class BabyNameComparison
{

	/**
	 * prints out possible baby name combinations
	 * @param nameOne - one of the names
	 * @param nameTwo - another of the names
	 * @param nameThree - the third name
	 */
	public static void babyNameCompare(String nameOne, String nameTwo,
			String nameThree)
	{
		StringBuilder comboOne = new StringBuilder();
		StringBuilder comboTwo = new StringBuilder();
		StringBuilder comboThree = new StringBuilder();
		StringBuilder comboFour = new StringBuilder();
		StringBuilder comboFive = new StringBuilder();
		StringBuilder comboSix = new StringBuilder();
		comboOne.append(nameOne + " " + nameTwo);
		comboTwo.append(nameOne + " " + nameThree);
		comboThree.append(nameThree + " " + nameOne);
		comboFour.append(nameTwo + " " + nameOne);
		comboFive.append(nameTwo + " " + nameThree);
		comboSix.append(nameThree + " " + nameTwo);
		System.out.printf(
				"Possible two-name combinations for baby names are"
						+ ":\n%s\n%s\n%s\n%s\n%s\n%s\n",
				comboOne, comboTwo, comboThree, comboFour, comboFive, comboSix);
	}

	public static void main(String[] args)
	{
		String nameOne;
		String nameTwo;
		String nameThree;
		Scanner babyNameFromUserKeyboard = new Scanner(System.in);
		System.out.println("Enter a possible name: ");
		nameOne = babyNameFromUserKeyboard.nextLine();
		System.out.println("Enter a possible name: ");
		nameTwo = babyNameFromUserKeyboard.nextLine();
		System.out.println("Enter a possible name: ");
		nameThree = babyNameFromUserKeyboard.nextLine();
		babyNameFromUserKeyboard.close();
		babyNameCompare(nameOne, nameTwo, nameThree);
	}
}
