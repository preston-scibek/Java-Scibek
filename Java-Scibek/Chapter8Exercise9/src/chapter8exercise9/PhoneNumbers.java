package chapter8exercise9;

import java.util.Scanner;

public class PhoneNumbers
{
	/**
	 * checks if name in list
	 * @param firstNameArray - array of first
	 * @param toCheck - name to check
	 * @param counter - current number of names
	 * @return - the location in the list
	 */
	public static int checkIfInList(String[] firstNameArray, String toCheck,
			int counter)
	{
		int inc = 0;
		for(inc = 0; inc < counter; inc++)
		{
			if(firstNameArray[inc].equalsIgnoreCase(toCheck))
			{
				return inc;
			}
			else
			{
				continue;
			}
		}
		return 999;
	}

	/**
	 * runs the phone book function loooping through until user says quit
	 */
	public static void phoneNumberDirectory()
	{
		String[] firstNameArrayParallel;
		String[] phoneNumberArrayParallel;
		firstNameArrayParallel = new String[30];
		phoneNumberArrayParallel = new String[30];
		int inc = 0;
		for(inc = 0; inc < 10; inc++)
		{
			switch (inc)
			{
				case 0:
					phoneNumberArrayParallel[inc] = "(111) 111-1111";
					firstNameArrayParallel[inc] = "Joe";
					break;
				case 1:
					phoneNumberArrayParallel[inc] = "(222) 222-2222";
					firstNameArrayParallel[inc] = "Bob";
					break;
				case 2:
					phoneNumberArrayParallel[inc] = "(333) 333-3333";
					firstNameArrayParallel[inc] = "Tom";
					break;
				case 3:
					phoneNumberArrayParallel[inc] = "(444) 4444-4444";
					firstNameArrayParallel[inc] = "Rob";
					break;
				case 4:
					phoneNumberArrayParallel[inc] = "(555) 555-5555";
					firstNameArrayParallel[inc] = "Ron";
					break;
				case 5:
					phoneNumberArrayParallel[inc] = "(666) 666-6666";
					firstNameArrayParallel[inc] = "Jim";
					break;
				case 6:
					phoneNumberArrayParallel[inc] = "(777) 777-7777";
					firstNameArrayParallel[inc] = "Tim";
					break;
				case 7:
					phoneNumberArrayParallel[inc] = "(888) 888-8888";
					firstNameArrayParallel[inc] = "Sam";
					break;
				case 8:
					phoneNumberArrayParallel[inc] = "(999) 999-9999";
					firstNameArrayParallel[inc] = "Ted";
					break;
				case 9:
					phoneNumberArrayParallel[inc] = "(000) 000-000";
					firstNameArrayParallel[inc] = "Moe";
					break;
				default:
					break;
			}
		}
		int counter = 10;
		Scanner userKeyboard = new Scanner(System.in);
		String userName;
		String userPhone;
		while(true)
		{
			System.out.printf("\nEnter a person's name: ");
			userName = userKeyboard.nextLine();
			if(userName.equals("quit"))
			{
				break;
			}
			else
			{
				if(counter <= 30)
				{
					int locationOfNumber = checkIfInList(firstNameArrayParallel,
							userName, counter);
					if(locationOfNumber != 999)
					{
						System.out.printf("\n%s's number is %s.", userName,
								phoneNumberArrayParallel[locationOfNumber]);

					}
					else
					{
						firstNameArrayParallel[counter] = userName;
						System.out.print("\nEnter the person's phone number: ");
						userPhone = userKeyboard.nextLine();
						phoneNumberArrayParallel[counter] = userPhone;
						counter++;
					}

				}
				else
				{
					System.out.printf("\nThe list is full.");
				}

			}
		}
		userKeyboard.close();
	}

	public static void main(String[] args)
	{
		phoneNumberDirectory();
	}
}
