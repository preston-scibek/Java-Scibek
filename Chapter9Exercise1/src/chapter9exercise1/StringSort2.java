package chapter9exercise1;

import java.util.Scanner;

public class StringSort2
{
	/**
	 * sorts a list of strings
	 * @param counter - the number of words in the list
	 * @param listOfWords - list of strings to be sorted
	 */
	public static void sortList(String[] listOfWords, int counter)
	{
		int inc = 0;
		int incTwo = 0;
		String tempString;
		for(inc = 0; inc < counter - 1; inc++)
		{
			for(incTwo = 0; incTwo < counter - 1; incTwo++)
			{
				if(listOfWords[incTwo]
						.compareToIgnoreCase(listOfWords[incTwo + 1]) > 0)
				{
					tempString = listOfWords[incTwo];
					listOfWords[incTwo] = listOfWords[incTwo + 1];
					listOfWords[incTwo + 1] = tempString;
				}
			}
		}
		for(inc = 0; inc < counter; inc++)
		{
			System.out.println(listOfWords[inc]);
		}
	}

	/**
	 * creates a list of words based on user input
	 */
	public static void createList()
	{
		String[] listOfWords = new String[20];
		Scanner userKeyboard = new Scanner(System.in);
		String userInput;
		int counter = 0;
		while(true)
		{
			System.out.print("\nEnter the next word in list or enter"
					+ " quit to stop entering words: ");
			userInput = userKeyboard.nextLine();
			if(userInput.equals("quit"))
			{
				break;
			}
			else
			{
				if(counter < 20)
				{
					listOfWords[counter] = userInput;
					counter++;
				}
				else
				{
					break;
				}
			}
		}
		userKeyboard.close();
		sortList(listOfWords, counter);
	}

	public static void main(String[] args)
	{
		createList();
	}
}
