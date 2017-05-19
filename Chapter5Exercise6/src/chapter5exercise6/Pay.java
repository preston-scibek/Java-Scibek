package chapter5exercise6;

import static betterutils.BetterUtils.*;
import java.util.Scanner;

public class Pay
{
	/**
	 * calculates the pay based on a skill level
	 * @param skillLevel - the skill level of the employee
	 * @return - the hourly salary
	 */
	public static double skillLvlPay(int skillLevel)
	{
		final double SKILL_ONE = 17.00;
		final double SKILL_TWO = 20.00;
		final double SKILL_THREE = 22.00;
		switch (skillLevel)
		{
			case 1:
				return SKILL_ONE;
			case 2:
				return SKILL_TWO;
			case 3:
				return SKILL_THREE;
			default:
				println("ERROR: That is not a valid skill level!!!");
				return 0;
		}
	}

	/**
	 * gets the insurance plans
	 * @param keyboard - scanner
	 * @return - the insurance plans
	 */
	public static String[][] insurancePlan(Scanner keyboard)
	{
		print("Here are the insurance options:\nOption\tExplanation"
				+ "\tWeekly Cost to Employee ($)\n1\tMedical Insurance\t32.50"
				+ "\n2\tDental Insurance\t20.00\n3\tLong-Term disability "
				+ "insurance\t10.00\n\nEnter 1 for medical, 2 for dental 3 for"
				+ " long-term, 4 for medical and dental,\n 5 for dental and "
				+ "long-term, 6 for medical and long-term, and 7 for all "
				+ "three: ");
		int userInsurance = keyboard.nextInt();
		String[] medical =
				{ "1", "Medical Insurance", "32.50" };
		String[] dental =
				{ "2", "Dental Insurance", "20.00" };
		String[] longTerm =
				{ "3", "Long-term disability insurance", "10.00" };
		String[] placeHolder =
				{ "0", "0", "0" };
		String[][] userChoice = null;
		switch (userInsurance)
		{
			case 1:
				userChoice = new String[][]
				{ medical, placeHolder, placeHolder };
				return userChoice;
			case 2:
				userChoice = new String[][]
				{ dental, placeHolder, placeHolder };
				return userChoice;
			case 3:
				userChoice = new String[][]
				{ longTerm, placeHolder, placeHolder };
				return userChoice;
			case 4:
				userChoice = new String[][]
				{ medical, dental, placeHolder };
				return userChoice;
			case 5:
				userChoice = new String[][]
				{ dental, longTerm, placeHolder };
			case 6:
				userChoice = new String[][]
				{ medical, longTerm, placeHolder };
				return userChoice;
			case 7:
				userChoice = new String[][]
				{ medical, dental, longTerm };
				return userChoice;
			default:
				println("ERROR: Invalid Choice!!!!");
				userChoice = new String[][]
				{ placeHolder, placeHolder, placeHolder };
				return userChoice;
		}
	}

	/**
	 * calculates the pay
	 * @param hourlyPay - the hourly pay rate
	 * @param hours - the hours worked
	 * @param deductions - the total itemized deductions
	 * @param retired - the amount to put towards retirement
	 * @return - an array containing payment info
	 */
	public static double[] calcPay(double hourlyPay, double hours,
			double deductions, double retired)
	{
		double regHours = 0;
		double overHours = 0;
		if(hours > 40)
		{
			regHours = 40;
			overHours = hours - 40;
		}
		else
		{
			regHours = hours;
		}
		double regPay = regHours * hourlyPay;
		double overPay = (1.5 * hourlyPay) * overHours;
		double grossPay = regPay + overPay;
		double netPay = 0;
		deductions += grossPay * retired;
		if(deductions > grossPay)
		{
			netPay = -1;
		}
		else
		{
			netPay = grossPay - deductions;
		}
		double[] info =
				{ regPay, overPay, grossPay, deductions, netPay, hours,
						hourlyPay };
		return info;
	}

	/**
	 * displays the pay info
	 * @param info - array containing the pay info
	 */
	public static void displayInfo(double[] info)
	{
		print("\tPay Info\nHours Worked: %.2f\nHourly Pay Rate: %.2f"
				+ " $/hour\nRegular 40 Hour Pay: $%.2f\nOvertime Pay: $%.2f"
				+ "\nGross Pay: $%.2f\nTotal Deductions: $%.2f", info[5],
				info[6], info[0], info[1], info[2], info[3]);
		if(info[4] >= 0)
		{
			print("\nNet Pay: $" + info[4]);
		}
		else
		{
			println("\nERROR: Deductions cannot exceed gross pay!!!");
		}
	}

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		print("Enter your skill level: ");
		int skillLevel = keyboard.nextInt();
		print("Enter your weekly hours worked: ");
		double weeklyHours = keyboard.nextDouble();
		double hourlyPay = skillLvlPay(skillLevel);
		double retired = 0;
		String[][] insuranceChoices =
				{
						{ "0", "0", "0" },
						{ "0", "0", "0" },
						{ "0", "0", "0" } };
		if(hourlyPay != 0)
		{
			if(skillLevel > 1)
			{
				insuranceChoices = insurancePlan(keyboard);
			}
			if(skillLevel == 3)
			{
				print("Do you want to save for retirement?\n'y' for yes "
						+ "and 'n' for no");
				keyboard.nextLine();
				String retire = keyboard.nextLine().toLowerCase();
				if(retire.equals("y"))
				{
					retired = .03;
				}
				else if(retire.equals("n"))
				{
					retired = .03;
				}
				else
				{
					retired = .00;
				}
			}
			double[] info =
					calcPay(hourlyPay, weeklyHours,
							Double.parseDouble(insuranceChoices[0][2]) + Double
									.parseDouble(insuranceChoices[1][2])
					+ Double.parseDouble(insuranceChoices[2][2]), retired);
			if(info != null) // screw java i want to say info not null :{
			{
				displayInfo(info);
			}
		}
		keyboard.close();
	}

}
