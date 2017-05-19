package chapter5exercise3;

import java.util.Scanner;

public class CondoSalestTwo
{
	/**
	 * outputs the users choice of condo parking and the cost
	 * @param choiceForCondo - the users choice of condo
	 * @param choiceForParking - the users choice of parking
	 */
	public static void getCondo(int choiceForCondo, int choiceForParking)
	{
		final int PARK_VIEW_COST = 150000;
		final int GOLF_VIEW_COST = 170000;
		final int LAKE_VIEW_COST = 210000;
		final int INVALID_CODE = 0;
		final int GARAGE_PRICE = 5000;
		int garagePrice = 0;
		String hasGarage = "Parking Space";
		switch (choiceForParking)
		{
			case 1:
				garagePrice = GARAGE_PRICE;
				hasGarage = "Garage";
				break;
			case 2:
				break;
			default:
				System.out.print("Invalid code, assuming no garage.\n");
				return;
		}
		switch (choiceForCondo)
		{
			case 1:
				System.out.printf(
						"You have chosen the park view condo with "
								+ "a %s at $%d.",
						hasGarage, PARK_VIEW_COST + garagePrice);
				break;
			case 2:
				System.out.printf(
						"You have chosen the golf course view condo"
								+ " with a %s at $%d.",
						hasGarage, GOLF_VIEW_COST + garagePrice);
				break;
			case 3:
				System.out.printf(
						"You have chosen the lake view condo with a "
								+ "%s at $%d.",
						hasGarage, LAKE_VIEW_COST + garagePrice);
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
		int getUserParking;
		Scanner getUserPlaceToBuyKeyboard = new Scanner(System.in);
		System.out.print("Enter the condo you want to buy: (1) PARK VIEW"
				+ " (2) GOLF COURSE VIEW (3) LAKE VIEW: ");
		userPlaceToBuy = getUserPlaceToBuyKeyboard.nextInt();
		getUserPlaceToBuyKeyboard.nextLine();
		System.out.print("Enter the type of parking you want: (1)"
				+ " Garage (2) Parking Space");
		getUserParking = getUserPlaceToBuyKeyboard.nextInt();
		getUserPlaceToBuyKeyboard.close();
		getCondo(userPlaceToBuy, getUserParking);
	}
}
