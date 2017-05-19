package chapter5exercise9;

import java.util.Random;
import java.util.Scanner;
import static betterutils.BetterUtils.*;

public class TestApartments
{
	public static void main(String[] args)
	{
		Apartment[] apartmentList = new Apartment[5];
		for(int i = 0; i < apartmentList.length; i++)
		{
			Random rand = new Random();
			int apartmentNumber = rand.nextInt(5) + 1 + (i * 5);
			int bedroomNumber = rand.nextInt(10) + 1;
			double bathNumber = rand.nextInt(5) + (rand.nextInt(1) * .5);
			double cost = 500 + 100 * bedroomNumber + 100 * bathNumber
					+ apartmentNumber;
			apartmentList[i] = new Apartment(apartmentNumber, bedroomNumber,
					bathNumber, cost);
		}
		Scanner keyboard = new Scanner(System.in);
		print("Enter the number of required bedrooms: ");
		int bedNumber = keyboard.nextInt();
		print("Enter the number of required baths: ");
		double baths = keyboard.nextDouble();
		print("Enter the maximum rent you are willing to pay: ");
		double rent = keyboard.nextDouble();
		for(int i = 0; i < apartmentList.length; i++)
		{
			if(apartmentList[i].getNumberOfBedrooms() >= bedNumber
					&& apartmentList[i].getNumberOfBaths() >= baths
					&& apartmentList[i].getCostOfRent() <= rent)
			{
				println("Apartment Number: %d\nBedroom Number: %d"
						+ "\nBath Number: %.2f\nRent: $%.2f",
						apartmentList[i].getApartmentNumber(),
						apartmentList[i].getNumberOfBedrooms(),
						apartmentList[i].getNumberOfBaths(),
						apartmentList[i].getCostOfRent());
			}
		}
		keyboard.close();
	}

}
