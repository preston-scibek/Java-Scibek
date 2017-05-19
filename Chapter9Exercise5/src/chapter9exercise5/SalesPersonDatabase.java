package chapter9exercise5;

import java.util.Scanner;

public class SalesPersonDatabase
{
	/**
	 * updates the display
	 * @param newArray - the new array
	 * @param counter = counter of people
	 */
	public static void updateDisplay(Salesperson[] newArray, int counter)
	{
		int inc = 0;
		int incTwo = 0;
		Salesperson tempString;
		for(inc = 0; inc < counter - 1; inc++)
		{
			for(incTwo = 0; incTwo < counter - 1; incTwo++)
			{
				if(newArray[incTwo] == null || newArray[incTwo + 1] == null)
				{
					continue;
				}
				else if(newArray[incTwo].getIDNumber() > newArray[incTwo + 1]
						.getIDNumber())
				{
					tempString = newArray[incTwo];
					newArray[incTwo] = newArray[incTwo + 1];
					newArray[incTwo + 1] = tempString;
				}
			}
		}
		for(inc = 0; inc < counter; inc++)
		{
			if(!newArray[inc].getCanAccess())
			{
				continue;
			}
			else
			{
				System.out.println("ID: " + newArray[inc].getIDNumber()
						+ " Sales: " + newArray[inc].getSales());
			}
		}
	}

	/**
	 * builds a sales person array
	 */
	public static void setupSalesArray()
	{
		Salesperson[] salespersonArray;
		salespersonArray = new Salesperson[20];
		int inc = 0;
		Scanner userKeyboard = new Scanner(System.in);
		int counter;
		int id = 0;
		double sales;
		String userChoice;
		while(true)
		{
			try
			{
				System.out
						.print("\nType 'add' to add to database, \ntype 'delete"
								+ "' to delete an entry, \ntype 'change' to change an "
								+ "entry " + " or quit to exit: " + " ");
				userChoice = userKeyboard.nextLine();
				if(userChoice.equalsIgnoreCase("add"))
				{
					if(inc > 20)
					{
						System.out.println("The database is full.");
					}
					else
					{
						boolean inList = false;
						System.out.print("\nEnter an id to add: ");
						id = userKeyboard.nextInt();
						for(counter = 0; counter < inc; counter++)
						{

							if(inc != 0 && salespersonArray[counter]
									.getIDNumber() == id)
							{
								if(inc != 0 && !salespersonArray[counter]
										.getCanAccess())
								{
									System.out.println(
											"You can not access this record "
													+ "becuase you deleted the record");
									inList = true;
									break;
								}
								else
								{
									System.out
											.println("Error that id already ex"
													+ "ists.");
									inList = true;
									break;
								}
							}
						}
						if(inList == false)
						{
							System.out.print("\nEnter a sales amount: ");
							sales = userKeyboard.nextDouble();
							salespersonArray[inc] = new Salesperson(id, sales);
							inc++;
						}

					}
					updateDisplay(salespersonArray, inc);
				}
				else if(userChoice.equalsIgnoreCase("delete"))
				{
					if(inc == 0)
					{
						System.out.println("The database is empty.");
					}
					else
					{

						System.out.print("\nEnter an id to delete: ");
						id = userKeyboard.nextInt();
						boolean inList = false;
						for(counter = 0; counter <= inc; counter++)
						{
							if(salespersonArray[counter].getIDNumber() == id)
							{
								salespersonArray[counter].setCanAccess(false);
								salespersonArray[counter].setSalesAmout(0);
								inList = true;
								break;
							}
							else
							{
								continue;
							}
						}
						if(inList == false)
						{
							System.out.println("Error that id does not exist");
						}

					}
					updateDisplay(salespersonArray, inc);
				}
				else if(userChoice.equalsIgnoreCase("change"))
				{
					if(inc == 0)
					{
						System.out.println("The database is empty.");
					}
					else
					{
						System.out.print("\nEnter an id to change: ");
						id = userKeyboard.nextInt();
						boolean inList = false;
						for(counter = 0; counter < inc; counter++)
						{
							if(salespersonArray[counter].getIDNumber() == id
									&& salespersonArray[inc].getCanAccess())
							{
								System.out.print("\nEnter a sales amount: ");
								sales = userKeyboard.nextDouble();
								salespersonArray[counter].setSalesAmout(sales);
								inList = true;
								break;
							}
							else
							{
								continue;
							}
						}
						if(inList == false)
						{
							System.out.println("Error that id does not exist");
						}
					}
					updateDisplay(salespersonArray, inc);
				}
				else
				{

					updateDisplay(salespersonArray, inc);
					break;
				}
				userKeyboard.nextLine();
			}
			catch(Exception e)
			{
				System.out.println("Error that id does not exist");
				userKeyboard.nextLine();
			}
		}
		userKeyboard.close();
	}

	public static void main(String[] args)
	{
		setupSalesArray();
	}
}
