package chapter13exercise5;

import static betterutils.BetterUtils.println;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DisplaySelectedCustomersByBalance
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String file = "records.txt";
		String record = "";
		try
		{
			InputStream input =
					new BufferedInputStream(new FileInputStream(file));
			BufferedReader reader =
					new BufferedReader(new InputStreamReader(input));
			record = reader.readLine();
			boolean isThere = false;
			println("Enter an balance to be searched: ");
			int balance = keyboard.nextInt();
			while(record != null)
			{
				int i = 0;
				int j = 0;
				int count = 0;
				while(i < record.length())
				{
					if(record.charAt(i) == ',')
					{
						count++;
					}
					if(count == 3 && record.charAt(i) == ',')
					{
						j = i + 1;
					}
					i++;
					continue;
				}
				if(Integer.parseInt(record.substring(j)) > balance)
				{
					println(record);
					isThere = true;
				}
				record = reader.readLine();
			}
			if(!isThere)
			{
				println("There is no record with that balance.");
			}
			reader.close();
			keyboard.close();
		}
		catch(Exception e)
		{
			println("Exception: " + e);
		}
	}
}
