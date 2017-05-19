package chapter13exercise5;

import static betterutils.BetterUtils.*;
import static java.nio.file.StandardOpenOption.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WriteCustomerList
{
	public static void main(String[] args)
	{
		int howManyRecords = 0;
		Scanner keyboard = new Scanner(System.in);
		println("Enter how many records to input: ");
		howManyRecords = keyboard.nextInt();
		keyboard.nextLine();
		for(int i = 0; i < howManyRecords; i++)
		{
			String idNumber = "0";
			String firstName = "FIRSTNAME";
			String lastName = "LASTNAME";
			String balanceOwed = "0";
			print("Enter the id number: ");
			idNumber = keyboard.nextLine();
			print("Enter the balance owed: ");
			balanceOwed = keyboard.nextLine();
			print("Enter the first name: ");
			firstName = keyboard.nextLine();
			print("Enter the last name: ");
			lastName = keyboard.nextLine();
			String delimiter = ",";
			String record = idNumber + delimiter + firstName + delimiter
					+ lastName + delimiter + balanceOwed + "\n";
			try
			{
				Path file = Paths.get("records.txt");
				OutputStream output = new BufferedOutputStream(
						Files.newOutputStream(file, APPEND));
				BufferedWriter writer =
						new BufferedWriter(new OutputStreamWriter(output));
				writer.append(record, 0, record.length());
				writer.newLine();
				writer.close();
			}
			catch(Exception e)
			{
				println("error");
			}
		}
		keyboard.close();
	}
}
