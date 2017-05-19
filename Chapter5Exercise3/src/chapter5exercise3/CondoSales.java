package chapter5exercise3;

import java.util.Scanner;

public class CondoSales
{
	/**
	 * outputs the users choice of condo and the price
	 * @param choice - the choice of the user
	 */
	public static void getCondo(int choice)
	{
		final int PARK_VIEW_COST = 150000;
		final int GOLF_VIEW_COST = 170000;
		final int LAKE_VIEW_COST = 210000;
		final int INVALID_CODE = 0;
		switch (choice)
		{
			case 1:
				System.out.printf(
						"You have chosen the park view condo at " + "$%d.",
						PARK_VIEW_COST);
				break;
			case 2:
				System.out.printf("You have chosen the golf course view condo "
						+ "at $%d.", GOLF_VIEW_COST);
				break;
			case 3:
				System.out.printf(
						"You have chosen the lake view condo at " + "$%d.",
						LAKE_VIEW_COST);
				break;
			default:
				System.out.printf("Invalid Code, the cost is $%d",
						INVALID_CODE);
				break;
		}

	}

	public static void main(String[] args)
	{
		int userPlaceToBuy;
		Scanner getUserPlaceToBuyKeyboard = new Scanner(System.in);
		System.out.print("Enter the condo you want to buy: (1) PARK VIEW"
				+ " (2) GOLF COURSE VIEW (3) LAKE VIEW: ");
		userPlaceToBuy = getUserPlaceToBuyKeyboard.nextInt();
		getUserPlaceToBuyKeyboard.close();
		getCondo(userPlaceToBuy);
	}
}
