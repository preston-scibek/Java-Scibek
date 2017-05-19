package chapter2exercise11;

import java.util.Scanner;

public class MinutesConversion
{
	public static void main(String[] args)
	{
		final double MIN_IN_HOUR = 60;
		final double HOURS_IN_DAY = 24;
		final double MIN_IN_DAY = MIN_IN_HOUR * HOURS_IN_DAY;
		Scanner scannerForMinutesKeyboard = new Scanner(System.in);
		System.out.print("Enter a number of minutes to be converted.");
		int userMin = scannerForMinutesKeyboard.nextInt();
		scannerForMinutesKeyboard.close();
		double userMinHours = userMin / MIN_IN_HOUR;
		double userMinDays = userMin / MIN_IN_DAY;
		String result = String.format(
				"%d minutes equals %.3f hours and " + "%.3f days.", userMin,
				userMinHours, userMinDays);
		System.out.print(result);

	}
}
