package chapter5exercise5;

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2
{
	/**
	 * figures out the relation between the current date and the users dates
	 * @param userDay - day of the the date the user inputs
	 * @param userMonth - month of the date the user inputs
	 * @param userYear - year of the date the user inputs
	 */
	public static void whenIsIt(int userDay, int userMonth, int userYear)
	{
		if(LocalDate.of(userYear, userMonth, userDay).isBefore(LocalDate.now()))
		{
			System.out.print(LocalDate.of(userYear, userMonth, userDay)
					+ " is before " + LocalDate.now());
		}
		else if(LocalDate.of(userYear, userMonth, userDay)
				.isAfter(LocalDate.now()))
		{
			System.out.print(LocalDate.of(userYear, userMonth, userDay)
					+ " is after " + LocalDate.now());
		}
		else
		{
			System.out.print(LocalDate.of(userYear, userMonth, userDay) + " is "
					+ LocalDate.now());
		}
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the day part of the date: ");
		int userDate = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("\nEnter the month part of the date: ");
		int userMonth = keyboard.nextInt();
		keyboard.nextLine();
		System.out.print("\nEnter the year part of the date: ");
		int userYear = keyboard.nextInt();
		keyboard.close();
		whenIsIt(userDate, userMonth, userYear);
	}
}
