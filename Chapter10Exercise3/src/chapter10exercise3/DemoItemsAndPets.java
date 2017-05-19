package chapter10exercise3;

import static betterutils.BetterUtils.*;
import java.util.Scanner;

public class DemoItemsAndPets
{
	/**
	 * demos the items
	 */
	public static void demoItems()
	{
		Scanner keyboard = new Scanner(System.in);
		PetSold userPet;
		ItemSold userItem;
		println("Enter the invoice number: ");
		int userInvoice = keyboard.nextInt();
		println("Enter the price: ");
		double userPrice = keyboard.nextDouble();
		println("Enter the description: ");
		keyboard.nextLine();
		String userDescription = keyboard.nextLine();
		userItem = new ItemSold(userInvoice, userDescription, userPrice);
		println("Enter the invoice number: ");
		userInvoice = keyboard.nextInt();
		println("Enter the price: ");
		userPrice = keyboard.nextDouble();
		keyboard.nextLine();
		println("Enter the description: ");
		userDescription = keyboard.nextLine();
		println("Is it vaccinated: ");
		boolean isVaccinated = keyboard.nextBoolean();
		println("Is it neutered: ");
		boolean isNeutered = keyboard.nextBoolean();
		println("Is it housebroken: ");
		boolean isHousebroken = keyboard.nextBoolean();
		userPet = new PetSold(userInvoice, userDescription, userPrice,
				isVaccinated, isNeutered, isHousebroken);
		println("Item\nInvoice Number: %d\nPrice: $%.2f\nDescription: %s",
				userItem.getInvoiceNumber(), userItem.getPrice(),
				userItem.getDescription());
		println("Pet\nInvoice Number: %d\nPrice: $%.2f\nDescription: %s"
				+ "\nVaccinated: %b\nNeutered: %b\nHousebroken: %b",
				userPet.getInvoiceNumber(), userPet.getPrice(),
				userPet.getDescription(), userPet.getIsVaccinated(),
				userPet.getIsNeutered(), userPet.getIsHousebroken());
		keyboard.close();
	}

	public static void main(String[] args)
	{
		demoItems();
	}
}