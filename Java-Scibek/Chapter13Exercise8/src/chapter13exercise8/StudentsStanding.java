package chapter13exercise8;

import static betterutils.BetterUtils.*;
import java.io.FileOutputStream;
import java.util.Scanner;

public class StudentsStanding
{
	public static void studentStanding()
	{
		Scanner keyboard = new Scanner(System.in);
		print("Enter the student id number: ");
		String idNumber = keyboard.nextLine();
		print("Enter the students first name: ");
		String firstName = keyboard.nextLine();
		print("Enter the students last name: ");
		String lastName = keyboard.nextLine();
		String delimeter = ",";
		print("Enter the students gpa: ");
		double gpa = keyboard.nextDouble();
		String file = "";
		if(gpa <= 2.0)
		{
			file = "belowgpa.txt";
		}
		else
		{
			file = "abovegpa.txt";
		}
		try
		{
			FileOutputStream output = new FileOutputStream(file, true);
			String record = idNumber + delimeter + firstName + delimeter
					+ lastName + delimeter + String.valueOf(gpa);
			output.write(record.getBytes());
			output.close();
		}
		catch(Exception e)
		{
			println("Exception: " + e);
		}
		keyboard.close();

	}

	public static void main(String[] args)
	{
		studentStanding();
	}
}
