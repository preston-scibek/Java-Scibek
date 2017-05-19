package chapter9gamezone4;

import static betterutils.BetterUtils.*;
import java.util.Scanner;
import chapter9gamezone4.Die.RPS;

public class RockPaperScissors3
{
	/**
	 * RPS game between computer and user
	 * @param userChoice - user choice
	 * @param score - current score
	 * @return - returns the current score
	 */
	public static String rockPaperScissors2(RPS userChoice, String score)
	{
		Die computerChoice = new Die();
		RPS computerNumChoice = computerChoice.getChoice();

		switch (computerNumChoice)
		{
			case SC:
				switch (userChoice)
				{
					case SC:
						println("You both choose scissors.");
						return Character.toString(score.charAt(0))
								+ Character.toString(score.charAt(1))
								+ String.valueOf((Integer
										.parseInt(Character
												.toString(score.charAt(2)))
												+ 1));

					case RO:
						println("You win, you choose rock and the "
								+ "computer choose scissors.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));

					case PA:
						println("You lose, you choose paper and the "
								+ "computer choose scissors.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
					default:
						println("Invalid choice, you lose.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
				}
			case RO:
				switch (userChoice)
				{
					case SC:
						println("You lose, you choose scissors"
								+ " and the computer choose rock.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
					case RO:
						println("You both choose rock.");
						return Character.toString(score.charAt(0))
								+ Character.toString(score.charAt(1))
								+ String.valueOf((Integer
										.parseInt(Character
												.toString(score.charAt(2)))
												+ 1));
					case PA:
						println("You win, you choose paper and the "
								+ "computer choose rock.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));
					default:
						println("Invalid choice, you lose.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
				}
			case PA:
				switch (userChoice)
				{
					case SC:
						println("You win, you choose scissors and the "
								+ "computer choose paper.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));
					case RO:
						println("You lose, you choose rock and the "
								+ "computer choose paper.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
					case PA:
						println("You both choose paper.");
						return Character.toString(score.charAt(0))
								+ Character.toString(score.charAt(1))
								+ String.valueOf((Integer
										.parseInt(Character
												.toString(score.charAt(2)))
												+ 1));
					default:
						println("Invalid choice, you lose.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
				}
			default:
				return Character.toString(score.charAt(0))
						+ Character.toString(score.charAt(1))
						+ String.valueOf((Integer.parseInt(
								Character.toString(score.charAt(2))) + 1));

		}
	}

	/**
	 * starts the game
	 */
	public static void beginGame()
	{
		Scanner keyboard = new Scanner(System.in);
		String userChoice = "roooooooooooook";
		RPS realChoice = RPS.RO;
		boolean canStart = false;
		String score = "000";
		int inc = 0;
		for(inc = 0; inc < 10; inc++)
		{
			canStart = false;
			while(canStart != true)
			{
				println("Pick your object\nScissors\nRock\nPaper");
				userChoice = keyboard.nextLine().substring(0, 2).toUpperCase();
				try
				{

					realChoice = RPS.valueOf(userChoice);
					canStart = true;
					break;
				}
				catch(Exception e)
				{
					continue;
				}
			}
			score = rockPaperScissors2(realChoice, score);
		}
		println("The computer won %c times, you won %c times, and "
				+ "there were %c ties.", score.charAt(1), score.charAt(0),
				score.charAt(2));
		keyboard.close();
	}

	public static void main(String[] args)
	{

		beginGame();
	}
}
