package chapter8gamezone2;

public class FiveDice2
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
	 * @return - type of pairing the player has
	 */
	public static int whatTheyRoll(int[] curPlayerList)
	{
		int curRoll = 0;
		int highRoll = 0;
		int inc = 0;
		int count = 0;
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
				}
			}
		}
		return highRoll;
	}

	/**
	 * prints out who wins
	 * @param computer - computer pairing
	 * @param user - user pairing
	 */
	public static void whoWin(int computer, int user)
	{
		System.out.printf("Computer has %d of a kind\n", computer);
		System.out.printf("User has %d of a kind\n", user);
		if(computer > user)
		{
			System.out.println("Computer Wins");
		}
		else if(user > computer)
		{
			System.out.println("You win");
		}
		else
		{
			System.out.println("You Tied");
		}

	}

	public static void main(String[] args)
	{
		int[] computer = throwDie("Computer");
		int[] user = throwDie("User");
		int whatUserRoll = whatTheyRoll(user);
		int whatCompRoll = whatTheyRoll(computer);
		whoWin(whatCompRoll, whatUserRoll);
	}
}
