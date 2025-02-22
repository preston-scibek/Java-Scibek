package chapter13exercise10;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import static betterutils.BetterUtils.*;

public class CustomerItemOrder
{
	/**
	 * gets the name
	 * @param id - the id of the customer
	 * @return - the name
	 */
	public static String getName(String id)
	{
		StringBuffer idBuffer = new StringBuffer(id);
		idBuffer.ensureCapacity(3);
		idBuffer.setLength(3);
		String sample =
				"                  " + System.getProperty("line.separator");
		Path file = Paths.get("CompanyCustomerRecords.txt");
		FileChannel fc = null;
		try
		{
			fc = FileChannel.open(file, READ, WRITE);
		}
		catch(Exception e)
		{
			println("Exception: " + e);
		}
		try
		{

			String record = "";
			fc.position(
					sample.length() * Integer.parseInt(id) - sample.length());
			ByteBuffer buffer = ByteBuffer.wrap(sample.getBytes());
			fc.read(buffer);
			record = new String(buffer.array());
			if(record.substring(0, 3)
					.equals(idBuffer.toString().replaceAll("\\W", " ")))
			{
				return record;
			}

		}
		catch(Exception e)
		{
			println("Exception: " + e);
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * gets the name
	 * @param id - the id of the item
	 * @return - the item
	 */
	public static String getItem(String id)
	{
		StringBuffer idBuffer = new StringBuffer(id);
		idBuffer.ensureCapacity(3);
		idBuffer.setLength(3);
		String sample =
				"                      " + System.getProperty("line.separator");
		Path file = Paths.get("CompanyItemFile.txt");
		FileChannel fc = null;
		try
		{
			fc = FileChannel.open(file, READ, WRITE);
		}
		catch(Exception e)
		{
			println("Exception: " + e);
		}
		try
		{
			String record = "";
			fc.position(
					sample.length() * Integer.parseInt(id) - sample.length());
			ByteBuffer buffer = ByteBuffer.wrap(sample.getBytes());
			fc.read(buffer);
			record = new String(buffer.array());
			if(record.substring(0, 3)
					.equals(idBuffer.toString().replaceAll("\\W", " ")))
			{
				return record;
			}
		}
		catch(Exception e)
		{
			println("Exception: " + e);
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		print("Enter your customer id: ");
		String customerID = keyboard.nextLine();
		print("Enter the item id: ");
		String itemID = keyboard.nextLine();
		String item = getItem(itemID);
		String customer = getName(customerID);
		if(item == null || customer == null)
		{
			if(item == null)
			{
				println("The item id does not exist.");
			}
			else
			{
				println("The customer id does not exist.");
			}
		}
		else
		{
			println("CUSTOMER: %s\nITEM: %s", customer, item);
		}
		keyboard.close();

	}
}
