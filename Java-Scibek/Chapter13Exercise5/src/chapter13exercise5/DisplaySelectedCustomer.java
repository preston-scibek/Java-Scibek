package chapter13exercise5;

import static betterutils.BetterUtils.println;
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
/**import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;*/
import java.io.InputStreamReader;

public class DisplaySelectedCustomer
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
			println("Enter an id to be searched: ");
			int userID = keyboard.nextInt();
			boolean isThere = false;
			while(record != null)
			{
				int i = 0;
				while(record.charAt(i) != ',')
				{
					i++;
					continue;
				}
				if(Integer.parseInt(record.substring(0, i)) == userID)
				{
					isThere = true;
					println(record);
				}
				record = reader.readLine();
			}
			if(!isThere)
			{
				println("That record does not exist.");
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
