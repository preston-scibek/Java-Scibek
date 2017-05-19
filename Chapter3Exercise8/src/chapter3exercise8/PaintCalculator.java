package chapter3exercise8;

import java.util.Scanner;

public class PaintCalculator
{
	/**
	 * calculates the wall area, gets the gallons needed, and calculates the
	 * total cost
	 * @param lenRoom - length of room
	 * @param widthRoom - width of room
	 * @param heightRoom - height of room
	 * @return total price needed
	 */
	public static double calculatePaintCost(int lenRoom, int widthRoom,
			int heightRoom)
	{
		int wallAreaOfRoom =
				2 * (lenRoom * heightRoom) + 2 * (widthRoom * heightRoom);
		double gallons = calculateGallons(wallAreaOfRoom);
		System.out.printf("You will need %.3f gallons.", gallons);
		final int PRICE_PER_GALLON = 32;
		return PRICE_PER_GALLON * gallons;
	}

	/**
	 * calculates number of gallons needed
	 * @param wallArea - area of wall in feet
	 * @return - returns gallons needed
	 */
	public static double calculateGallons(int wallArea)
	{
		final double GALLON_COVERS_IN_FEET = 350;
		return wallArea / GALLON_COVERS_IN_FEET;
	}

	public static void main(String[] args)
	{
		Scanner getUserInputKeyboard = new Scanner(System.in);
		int userLenRoom;
		int userWidthRoom;
		int userHeightRoom;
		System.out.println("Enter the length of the room.");
		userLenRoom = getUserInputKeyboard.nextInt();
		getUserInputKeyboard.nextLine();
		System.out.println("Enter the width of the room.");
		userWidthRoom = getUserInputKeyboard.nextInt();
		getUserInputKeyboard.nextLine();
		System.out.println("Enter the height of the room.");
		userHeightRoom = getUserInputKeyboard.nextInt();
		getUserInputKeyboard.close();
		double costToPaintRoom =
				calculatePaintCost(userLenRoom, userWidthRoom, userHeightRoom);
		System.out.printf(
				"The cost to paint a %d-by-%d-foot room, with %d"
						+ "-foot ceilings is $%.2f.",
				userLenRoom, userWidthRoom, userHeightRoom, costToPaintRoom);
	}
}
