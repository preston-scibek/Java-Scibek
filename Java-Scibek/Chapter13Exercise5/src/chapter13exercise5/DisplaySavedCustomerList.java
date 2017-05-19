package chapter13exercise5;

import java.io.*;
import static betterutils.BetterUtils.*;

public class DisplaySavedCustomerList
{
	public static void main(String[] args)
	{
		String file = "records.txt";
		String record = "";
		try
		{
			InputStream input =
					new BufferedInputStream(new FileInputStream(file));
			BufferedReader reader =
					new BufferedReader(new InputStreamReader(input));
			record = reader.readLine();
			while(record != null)
			{
				println(record);
				record = reader.readLine();
			}
			reader.close();
		}
		catch(Exception e)
		{
			println("Exception");
		}
	}
}
