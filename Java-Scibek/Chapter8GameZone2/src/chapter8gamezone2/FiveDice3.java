package chapter8gamezone2;

public class FiveDice3
{
	/**
	 * returns a list of ints as dice rolls
	 * @param whoIsThisFor - player that the rolls are for
	 * @return - array of the dice rolls
	 */
	public static int[] throwDie(String whoIsThisFor)
	{
		// Die dieOne = new Die();
		// Die dieTwo = new Die();
		// Die dieThree = new Die();
		// Die dieFour = new Die();
		// Die dieFive = new Die();
		int[] currentRollsList = new int[5];
		int inc = 0;
		System.out.printf("%s rolled: ", whoIsThisFor);
		for(inc = 0; inc < 5; inc++)
		{
			Die dice = new Die();
			currentRollsList[inc] = dice.getRolledNumber();
			System.out.printf("%d ", currentRollsList[inc]);
		}
		System.out.print("\n");
		return currentRollsList;
	}

	/**
	 * what the players roll and what type of pairing
	 * @param curPlayerList - list of current players rolls
	 * @return - type of pairing the player has and high roll value
	 */
	public static int[] whatTheyRoll(int[] curPlayerList)
	{
		int curRoll = 0;
		int highRoll = 0;
		int inc = 0;
		int count = 0;
		int highNumber = 0;
		for(inc = 0; inc < curPlayerList.length; inc++)
		{
			if(curRoll >= highRoll)
			{
				highRoll = curRoll;
				curRoll = 0;
			}
			else
			{
				curRoll = 0;
			}
			for(count = 0; count < curPlayerList.length; count++)
			{
				if(curPlayerList[inc] == curPlayerList[count])
				{
					curRoll++;
					if(curRoll > highRoll)
					{
						highRoll = curRoll;
						highNumber = curPlayerList[count];
					}
					else if(curRoll == highRoll)
					{

						highNumber = highNumber >= curPlayerList[count]
								? highNumber : curPlayerList[count];
					}
				}
			}
		}
		int[] valueOfRollPlusPairing =
				{ highRoll, highNumber };
		return valueOfRollPlusPairing;
	}

	/**
	 * prints out who wins
	 * @param computerScoreList - computer pairing and high number value
	 * @param userScoreList - user pairing and high number value
	 */
	public static void whoWin(int[] computerScoreList, int[] userScoreList)
	{
		System.out.printf("Computer has %d of a kind\n", computerScoreList[0]);
		System.out.printf("User has %d of a kind\n", userScoreList[0]);
		if(computerScoreList[0] > userScoreList[0])
		{
			System.out.println("Computer Wins");
		}
		else if(userScoreList[0] > computerScoreList[0])
		{
			System.out.println("You win");
		}
		else if(userScoreList[1] > computerScoreList[1])
		{
			System.out.println("Your values were higher - you win");
		}
		else if(userScoreList[1] < computerScoreList[1])
		{
			System.out.println("Computer values were hig" + "her - you lose");
		}
		else
		{
			System.out.println("Values were the same - you tied");
		}
	}

	public static void main(String[] args)
	{
		int[] computer = throwDie("Computer");
		int[] user = throwDie("User");
		int[] whatUserRollList = whatTheyRoll(user);
		int[] whatCompRollList = whatTheyRoll(computer);
		whoWin(whatCompRollList, whatUserRollList);
	}
}
