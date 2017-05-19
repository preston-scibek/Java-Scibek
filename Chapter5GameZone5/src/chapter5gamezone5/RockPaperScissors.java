package chapter5gamezone5;

import java.util.Scanner;

public class RockPaperScissors
{

	/**
	 * RPS game between computer and user
	 * @param userChoice - user choice
	 */
	public static void rockPaperScissors(int userChoice)
	{
		Die computerChoice = new Die();
		int computerNumChoice = computerChoice.getRolledNumber();
		switch (computerNumChoice)
		{
			case 1:
				switch (userChoice)
				{
					case 1:
						System.out.println("You both choose scissors.");
						break;
					case 2:
						System.out.println("You win, you choose rock and the "
								+ "computer choose scissors.");
						break;
					case 3:
						System.out.println("You lose, you choose paper and the "
								+ "computer choose scissors.");
						break;
					default:
						System.out.println("Invalid choice, you lose.");
						break;
				}
				break;
			case 2:
				switch (userChoice)
				{
					case 1:
						System.out.println("You lose, you choose scissors"
								+ " and the computer choose rock.");
						break;
					case 2:
						System.out.println("You both choose rock.");
						break;
					case 3:
						System.out.println("You win, you choose paper and the "
								+ "computer choose rock.");
						break;
					default:
						System.out.println("Invalid choice, you lose.");
						break;
				}
				break;
			case 3:
				switch (userChoice)
				{
					case 1:
						System.out
								.println("You win, you choose scissors and the "
										+ "computer choose paper.");
						break;
					case 2:
						System.out.println("You lose, you choose rock and the "
								+ "computer choose paper.");
						break;
					case 3:
						System.out.println("You both choose paper.");
						break;
					default:
						System.out.println("Invalid choice, you lose.");
						break;
				}
				break;
			default:
				break;

		}
	}

	public static void main(String[] args)
	{
		Scanner userRockPaperScissorsChoiceKeyboard = new Scanner(System.in);
		System.out.print("Pick your object\nScissors(1)\nRock(2)\nPaper(3)");
		int userChoice = userRockPaperScissorsChoiceKeyboard.nextInt();
		userRockPaperScissorsChoiceKeyboard.close();
		rockPaperScissors(userChoice);
	}
}
