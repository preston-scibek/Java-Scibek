package chapter6exercise2;

import java.util.Scanner;

public class CountByAnything
{
	/**
	 * counts by any int and displays the numbers
	 * @param userCounter - user input of number to count by
	 */
	public static void countByAny(int userCounter)
	{
		int inc = 0;
		int counter = 0;
		for(inc = userCounter; inc <= userCounter * 100; inc += userCounter)
		{
			if(counter == 9)
			{
				System.out.printf("%d\n", inc);
				counter = 0;
				continue;
			}
			else
			{
				System.out.printf("%d, ", inc);
				counter += 1;
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner userKeyboardCounterInput = new Scanner(System.in);
		int userInput;
		System.out.println("Enter the number to count by: ");
		userInput = userKeyboardCounterInput.nextInt();
		userKeyboardCounterInput.close();
		countByAny(userInput);
	}
}
