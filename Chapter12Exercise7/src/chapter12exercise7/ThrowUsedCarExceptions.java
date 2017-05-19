package chapter12exercise7;

import static betterutils.BetterUtils.*;
import java.util.Scanner;

public class ThrowUsedCarExceptions
{
	public static void testThrownErrors()
	{
		UsedCar[] usedCarList = new UsedCar[8];
		Scanner keyboard = new Scanner(System.in);
		for(int i = 0; i < usedCarList.length; i++)
		{
			print("Enter the vin: ");
			int vin = keyboard.nextInt();
			keyboard.nextLine();
			print("Enter the make: ");
			String make = keyboard.nextLine();
			print("Enter the year: ");
			int year = keyboard.nextInt();
			print("Enter the mileage: ");
			int mileage = keyboard.nextInt();
			print("Enter the price: ");
			int price = keyboard.nextInt();
			try
			{
				usedCarList[i] = new UsedCar(vin, year, mileage, price, make);
			}
			catch(UsedCarException e)
			{
				e.getMessage();
				usedCarList[i] = null;
			}
		}
		keyboard.close();
		for(int i = 0; i < usedCarList.length; i++)
		{
			if(usedCarList[i] != null)
			{
				println(usedCarList[i].toString());
			}
			else
			{
				continue;
			}
		}
	}

	public static void main(String[] args) throws UsedCarException
	{
		testThrownErrors();
	}
}
