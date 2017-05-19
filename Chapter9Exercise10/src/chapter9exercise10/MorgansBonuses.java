package chapter9exercise10;

import java.util.Scanner;

public class MorgansBonuses
{
	/**
	 * calculates the bonuses
	 */
	public static void calcBonus()
	{
		final int[][] BONUS_CHART_SHEET =
				{
						{ 0, 0, 1, 2, 3, 4 },
						{ 0, 5, 9, 16, 22, 30 },
						{ 1, 10, 12, 18, 24, 36 },
						{ 2, 20, 25, 32, 42, 53 },
						{ 3, 32, 38, 45, 55, 68 },
						{ 4, 46, 54, 65, 77, 90 },
						{ 5, 60, 72, 84, 96, 120 },
						{ 6, 85, 100, 120, 140, 175 }, };
		Scanner userKeyboard = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter how many positive reviews: ");
			int userReviews = userKeyboard.nextInt();
			userReviews = userReviews >= 4 ? 4 : userReviews;
			System.out.println("Enter how many full weeks worked: ");
			int userWeeksWorked = userKeyboard.nextInt();
			if(userWeeksWorked == 666)
			{
				break;
			}
			else
			{
				userWeeksWorked = userWeeksWorked >= 6 ? 6 : userWeeksWorked;
				System.out.println("The bonus is $"
						+ BONUS_CHART_SHEET[userWeeksWorked + 1][userReviews
								+ 1]);
			}
		}
		userKeyboard.close();
	}

	public static void main(String[] args)
	{
		calcBonus();
	}
}
