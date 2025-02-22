package chapter5exercise5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class PastPresentFuture
{
	/**
	 * figures out the relation between the current date and the users dates
	 * @param userDay - day of the the date the user inputs
	 * @param userMonth - month of the date the user inputs
	 * @param userYear - year of the date the user inputs
	 */
	public static void whenIsTheDate(int userDay, int userMonth, int userYear)
	{
		DateFormat yearFormat = new SimpleDateFormat("yyyy");
		DateFormat monthFormat = new SimpleDateFormat("MM");
		Calendar cal = Calendar.getInstance();
		int yearDate = Integer.parseInt(yearFormat.format(cal.getTime()));
		int monthDate = Integer.parseInt(monthFormat.format(cal.getTime()));
		if(userYear != yearDate)
		{
			System.out.printf("%d/%d/%d is not this year(%d).", userMonth,
					userDay, userYear, yearDate, userMonth);
			return;
		}
		else if(userMonth < monthDate)
		{
			System.out.printf(
					"%d/%d/%d is this year(%d), and is in "
							+ "an earlier month(%d).",
					userMonth, userDay, userYear, yearDate, userMonth);
			return;
		}
		else if(userMonth > monthDate)
		{
			System.out.printf(
					"%d/%d/%d is this year(%d), and is in "
							+ "an later month(%d).",
					userMonth, userDay, userYear, yearDate, userMonth);
			return;
		}
		else
		{
			System.out.printf(
					"%d/%d/%d is this year(%d), and is in " + "this month(%d).",
					userMonth, userDay, userYear, yearDate, userMonth);
			return;
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
		whenIsTheDate(userDate, userMonth, userYear);
	}
}
