package finalproject;

import static betterutils.BetterUtils.*;

public class Poker extends CardGame // Sub Class
{
	enum poker
	{
		ROYALFLUSHOFSPADES, ROYALFLUSH, STRAIGHTFLUSH, FOUROFAKIND, FULLHOUSE,
		FLUSH, STRAIGHT, THREEOFAKIND, TWOPAIR, ONEPAIR, HIGHCARDACE,
		HIGHCARDKING, HIGHCARDQUEEN, HIGHCARDJACK, HIGHCARD10, HIGHCARD9,
		HIGHCARD8, HIGHCARD7, HIGHCARD6, HIGHCARD5, HIGHCARD4, HIGHCARD3,
		HIGHCARD2
	};

	/**
	 * builds a poker
	 */
	public Poker()
	{
		super();
		this.shuffle();
	}

	/**
	 * sorts the hand
	 * @param hand - hand to be sorted
	 * @return - the sorted hand
	 */
	public Card[] sortList(Card[] hand) // Method That Takes Array As Argument
										// Method That Returns Array
	{
		int inc = 0;
		int incTwo = 0;
		String tempString;
		for(inc = 0; inc < hand.length - 1; inc++) // Loop 14
		{
			for(incTwo = 0; incTwo < hand.length - 1; incTwo++) // Loop 15
			{
				if(hand[incTwo].getValue() // If Statement
						.compareToIgnoreCase(hand[incTwo + 1].getValue()) > 0)
				{
					tempString = hand[incTwo].getValue();
					hand[incTwo].setValue(hand[incTwo + 1].getValue());
					hand[incTwo + 1].setValue(tempString);
				}
			}
		}
		return hand;
	}

	/**
	 * tests how long to get something
	 * @param thing - thing to match
	 */
	public void play(poker thing)
	{
		Card[] user = this.deal("User"); // Array
		user = sortList(user); // Method That Takes Array As Argument
								// Method That Returns Array
		poker[] users = this.cards(user); // Array
		int counter = 0;
		while(!users[0].equals(thing)) // Loop 16
		{
			this.shuffle();
			user = this.deal("User");
			user = sortList(user); // Method That Takes Array As Argument
									// Method That Returns Array
			users = this.cards(user);
			counter++;
		}
		println(counter);
		println("USER: %s", users[0].toString());

	}

	/**
	 * plays the game
	 */
	public void play()
	{
		Card[] computer = this.deal("Computer"); // Array 
		computer = sortList(computer); // Method That Takes Array As Argument
										// Method That Returns Array
		Card[] user = this.deal("User"); // Array
		user = sortList(user); // Method That Takes Array As Argument
								// Method That Returns Array
		poker[] users = this.cards(user); // Array
		poker[] computers = this.cards(computer); // Array
		if(users[0].compareTo(computers[0]) < 0) // If Statement
		{
			println("USER: %s COMPUTER: %s", users[0].toString(),
					computers[0].toString());
			this.winner();
		}
		else if(users[0].compareTo(computers[0]) > 0)
		{
			println("USER: %s COMPUTER: %s", users[0].toString(),
					computers[0].toString());
			this.loser();
		}
		else
		{
			if(users[1].compareTo(computers[1]) > 0) // If Statement
			{
				println("USER: %s %s COMPUTER: %s %s", users[0].toString(),
						users[1].toString(), computers[0].toString(),
						computers[1].toString());
				this.loser();
			}
			else if(users[1].compareTo(computers[1]) < 0)
			{
				println("USER: %s %s COMPUTER: %s %s", users[0].toString(),
						users[1].toString(), computers[0].toString(),
						computers[1].toString());

				this.winner();
			}
			else
			{
				println("USER: %s %s COMPUTER: %s %s", users[0].toString(),
						users[1].toString(), computers[0].toString(),
						computers[1].toString());
				println("YOU TIED");
			}
		}
	}

	/**
	 * returns a list of cards
	 * @param whoIsThisFor - player that the cards are for
	 * @return - array of the cards
	 */
	public Card[] deal(String whoIsThisFor) // Method That Returns Array
	{
		Card[] currentRollsList = new Card[5];
		print(whoIsThisFor + " drew: ");
		for(int i = 0; i < 5; i++) // Loop 17
		{
			if(whoIsThisFor.equalsIgnoreCase("user")) // If Statement
			{
				currentRollsList[i] = this.deck[i];
				print(currentRollsList[i].toString() + " ");
				if(currentRollsList[i].getValue().equalsIgnoreCase("ace")) 
					// If Statement
				{
					currentRollsList[i].setValue("zAce");
				}
				else if(currentRollsList[i].getValue().equalsIgnoreCase("king"))
				{
					currentRollsList[i].setValue("xKing");
				}
				else if(currentRollsList[i].getValue().equals("10"))
				{
					currentRollsList[i].setValue("910");
				}
			}
			else
			{
				currentRollsList[i] = this.deck[i + 5];
				print(currentRollsList[i].toString() + " ");
				if(currentRollsList[i].getValue().equalsIgnoreCase("ace")) 
					// If Statement
				{
					currentRollsList[i].setValue("zAce");
				}
				else if(currentRollsList[i].getValue().equalsIgnoreCase("king"))
				{
					currentRollsList[i].setValue("xKing");
				}
				else if(currentRollsList[i].getValue().equals("10"))
				{
					currentRollsList[i].setValue("910");
				}
			}
		}
		print("\n");
		return currentRollsList;
	}

	/**
	 * checks the pairing of a person hand
	 * @param hand - the hand they have
	 * @return - the pairing they have
	 */
	public poker[] cards(Card[] hand)  // Method That Takes Array As Argument
										// Method That Returns Array
	{
		int curRoll = 0;
		int highRoll = 0;
		int inc = 0;
		int count = 0;
		boolean straightt = true;
		String highNumber = "0";
		int twoPair = 0;
		int fullHouse = 0;
		poker highCard = null;
		poker pairing = null;
		boolean flush = true;
		boolean royaltyTrue = false;
		boolean royalty = false;
		for(inc = 0; inc < hand.length; inc++) // Loop 18
		{
			if(curRoll >= highRoll) // If Statement
			{
				highRoll = curRoll;
				if(highRoll == 2) // If Statement
				{
					fullHouse++;
					twoPair++;
				}
				else if(highRoll == 3) 
				{
					fullHouse++;
				}
				curRoll = 0;
			}
			else
			{
				curRoll = 0;
			}
			for(count = 0; count < hand.length; count++) // Loop 19
			{
				flush = flush && hand[inc].getSuit()
						.equalsIgnoreCase(hand[count].getSuit());
				if(hand[inc].getValue().equals(hand[count].getValue()))
															// If Statement
				{
					curRoll++;
					if(curRoll >= highRoll) // If Statement
					{
						try
						{
							if(Integer.parseInt(hand[inc].getValue()) > Integer
									.parseInt(highNumber)) // If Statement 
							{
								highNumber = hand[inc].getValue();
							}
						}
						catch(Exception e)
						{
							if(highNumber.compareTo(hand[inc].getValue()) < 0)
																// If Statement
							{
								highNumber = hand[inc].getValue();
							}
						}
					}
				}
				else
				{
					continue;
				}
			}
		}
		if(hand[0].getValue().equals("2") && hand[1].getValue().equals("3")
				&& hand[2].getValue().equals("4")
				&& hand[3].getValue().equals("5")
				&& hand[4].getValue().equals("zAce")) // If Statement
		{
			straightt = true;
		}
		else if(hand[0].getValue().equals("3") &&
				hand[1].getValue().equals("4")
				&& hand[2].getValue().equals("5")
				&& hand[3].getValue().equals("6")
				&& hand[4].getValue().equals("7"))
		{
			straightt = true;
		}
		else if(hand[0].getValue().equals("4") &&
				hand[1].getValue().equals("5")
				&& hand[2].getValue().equals("6")
				&& hand[3].getValue().equals("7")
				&& hand[4].getValue().equals("8"))
		{
			straightt = true;
		}
		else if(hand[0].getValue().equals("5") &&
				hand[1].getValue().equals("6")
				&& hand[2].getValue().equals("7")
				&& hand[3].getValue().equals("8")
				&& hand[4].getValue().equals("9"))
		{
			straightt = true;
		}
		else if(hand[0].getValue().equals("6") &&
				hand[1].getValue().equals("7")
				&& hand[2].getValue().equals("8")
				&& hand[3].getValue().equals("9")
				&& hand[4].getValue().equals("910"))
		{
			straightt = true;
		}
		else if(hand[0].getValue().equals("7") &&
				hand[1].getValue().equals("8")
				&& hand[2].getValue().equals("910")
				&& hand[3].getValue().equals("Jack")
				&& hand[4].getValue().equals("Queen"))
		{
			straightt = true;
		}
		else if(hand[0].getValue().equals("8")
				&& hand[1].getValue().equals("910")
				&& hand[2].getValue().equals("Jack")
				&& hand[3].getValue().equals("Queen")
				&& hand[4].getValue().equals("xKing"))
		{
			straightt = true;
		}
		else if(hand[0].getValue().equals("910")
				&& hand[1].getValue().equals("Jack")
				&& hand[2].getValue().equals("Queen")
				&& hand[3].getValue().equals("xKing")
				&& hand[4].getValue().equals("zAce"))
		{
			straightt = true;
			if(flush && hand[0].getSuit().equals("Spades")) // If Statement
			{
				royaltyTrue = true;
				royalty = true;
			}
			else if(flush)
			{
				royalty = true;
			}
		}
		else
		{
			straightt = false;
		}
		switch (highNumber) // Switch Statement
		{
			case "2":
				highCard = poker.HIGHCARD2;
				break;
			case "3":
				highCard = poker.HIGHCARD3;
				break;
			case "4":
				highCard = poker.HIGHCARD4;
				break;
			case "5":
				highCard = poker.HIGHCARD5;
				break;
			case "6":
				highCard = poker.HIGHCARD6;
				break;
			case "7":
				highCard = poker.HIGHCARD7;
				break;
			case "8":
				highCard = poker.HIGHCARD8;
				break;
			case "9":
				highCard = poker.HIGHCARD9;
				break;
			case "910":
				highCard = poker.HIGHCARD10;
				break;
			case "Jack":
				highCard = poker.HIGHCARDJACK;
				break;
			case "Queen":
				highCard = poker.HIGHCARDQUEEN;
				break;
			case "xKing":
				highCard = poker.HIGHCARDKING;
				break;
			default:
				highCard = poker.HIGHCARDACE;
				break;
		}
		if(twoPair == 4) // If Statement
		{
			pairing = poker.TWOPAIR;
		}
		else if(fullHouse == 5)
		{
			pairing = poker.FULLHOUSE;
		}
		else if(highRoll == 3)
		{
			pairing = poker.THREEOFAKIND;
		}
		else if(highRoll == 4)
		{
			pairing = poker.FOUROFAKIND;
		}
		else if(highRoll == 2)
		{
			pairing = poker.ONEPAIR;
		}
		else if(royaltyTrue)
		{
			pairing = poker.ROYALFLUSHOFSPADES;
		}
		else if(royalty)
		{
			pairing = poker.ROYALFLUSH;
		}
		else if(flush && straightt)
		{
			pairing = poker.STRAIGHTFLUSH;
		}
		else if(straightt)
		{
			pairing = poker.STRAIGHT;
		}
		else if(flush)
		{
			pairing = poker.FLUSH;
		}
		else
		{
			pairing = highCard;
		}
		poker[] pairingList =
				{ pairing, highCard }; // Array
		return pairingList;
	}

	/**
	 * unused deal
	 * @return - nothing
	 */
	@Override
	public boolean deal()
	{
		return false;
	}

	/**
	 * prints the description
	 */
	@Override
	public void displayDescription()
	{
		println("This poker is played against the computer\n"
				+ "The person who has the highest hand wins");

	}

	/**
	 * prints the rules
	 */
	@Override
	public void rules()
	{
		println("WINNER TABLE:\nStraight flush\nFour of a kind\n"
				+ "Full house\nFlush\nStraight\nThree of a kind\nTwo pair"
				+ "\nOne pair\nHigh card");

	}
}
