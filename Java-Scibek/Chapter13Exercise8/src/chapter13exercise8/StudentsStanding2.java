package chapter13exercise8;

import static betterutils.BetterUtils.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StudentsStanding2
{

	/**
	 * prints out the gpas
	 * @param file - the file to access
	 * @param location - location of the gpas compared to 2.0
	 */
	public static void printGPAS(String file, String location)
	{
		String student = "";
		try
		{
			ArrayList<String[]> studentsList = new ArrayList<String[]>();
			InputStream input =
					new BufferedInputStream(new FileInputStream(file));
			BufferedReader reader =
					new BufferedReader(new InputStreamReader(input));
			student = reader.readLine();
			while(student != null)
			{
				int i = 0;
				int j = 0;
				int l = 0;
				String[] tempArray = new String[4];
				for(i = 0; i < student.length(); i++)
				{
					if(student.charAt(i) == ',' && j == 0)
					{
						tempArray[l] = student.substring(j, i);
						j = i + 1;
						l++;
					}
					else if(student.charAt(i) == ',')
					{
						tempArray[l] = student.substring(j, i);
						j = i + 1;
						l++;
					}
				}
				tempArray[l] = student.substring(j, i);
				studentsList.add(tempArray);
				student = reader.readLine();
			}
			reader.close();
			println(location);
			println("ID,First Name,Last Name,GPA,amount from 2.0");
			for(int i = 0; i < studentsList.size(); i++)
			{
				String studentRecord = "";
				for(int j = 0; j < studentsList.get(i).length; j++)
				{
					studentRecord += studentsList.get(i)[j] + ",";
				}
				studentRecord += String.valueOf(
						Double.parseDouble(studentsList.get(i)[3]) - 2.0);
				println(studentRecord);
			}
		}
		catch(Exception e)
		{
			println("Exception: " + e);
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		String file = "abovegpa.txt";
		String above = "ABOVE THE CUTOFF";
		String below = "BELOW THE CUTOFF";
		String file2 = "belowgpa.txt";
		printGPAS(file, above);
		printGPAS(file2, below);
	}
}
