package chapter7exercise11;

import java.util.Scanner;

public class ConstructID
{
	/**
	 * builds user id based on name and address
	 * @param name - users full name
	 * @param address - users address
	 */
	public static void buildUserID(String name, String address)
	{
		int inc = 0;
		String userID = "";
		for(inc = 0; inc < name.length(); inc++)
		{
			if(inc == 0)
			{
				userID = userID.concat(Character.toString(name.charAt(inc)));
			}
			if(Character.toString(name.charAt(inc)).matches(("\\s")))
			{
				userID = userID
						.concat(Character.toString(name.charAt(inc + 1)));
			}
			if(userID.length() >= 3)
			{
				break;
			}
			else
			{
				continue;
			}
		}
		for(inc = 0; inc < address.length(); inc++)
		{
			if(Character.toString(address.charAt(inc)).matches("[0-9]"))
			{
				userID = userID.concat(Character.toString(address.charAt(inc)));
			}
			else
			{
				continue;
			}
		}
		System.out.printf("Your unique user ID is %s", userID);
	}

	public static void main(String[] args)
	{
		Scanner userInputKeyboard = new Scanner(System.in);
		String userName;
		System.out.print("Enter your full name: ");
		userName = userInputKeyboard.nextLine();
		String userAddress;
		System.out.print("Enter your address: ");
		userAddress = userInputKeyboard.nextLine();
		userInputKeyboard.close();
		buildUserID(userName, userAddress);

	}
}
