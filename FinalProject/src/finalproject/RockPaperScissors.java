package finalproject;

import static betterutils.BetterUtils.*;
import java.util.Scanner; // Support Class
import finalproject.DieRPS.RPS;

public class RockPaperScissors extends MiniGame // Sub Class
{
	/**
	 * builds a rock paper scissors game
	 */
	public RockPaperScissors()
	{
		super();
	}

	/**
	 * RPS game between computer and user
	 * @param userChoice - user choice
	 * @param score - current score
	 * @return - returns the current score
	 */
	public String rockPaperScissors2(RPS userChoice, String score)
	{
		DieRPS computerChoice = new DieRPS();
		RPS computerNumChoice = computerChoice.getChoice();

		switch (computerNumChoice) // Switch Statement
		{
			case SC:
				switch (userChoice) // Switch Statement
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
					case SP:
						println("You win, you chose spock and the computer "
								+ "chose scissors.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));
					case LI:
						println("You lose, you chose lizard and the computer"
								+ " chose scissors.");
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
				switch (userChoice) // Switch Statement
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
					case SP:
						println("You win, you chose spock and the computer "
								+ "chose rock.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));
					case LI:
						println("You lose, you chose lizard and the computer"
								+ " chose rock.");
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
			case PA:
				switch (userChoice) // Switch Statement
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
					case SP:
						println("You lose, you chose spock and the computer "
								+ "chose paper.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
					case LI:
						println("You win, you chose lizard and the computer"
								+ " chose paper.");
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
			case LI:
				switch (userChoice) // Switch Statement
				{
					case SC:
						println("You win, you choose scissors and the "
								+ "computer choose lizard.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));
					case RO:
						println("You win, you choose rock and the "
								+ "computer choose lizard.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));
					case PA:
						println("You lose, you chose paper and the computer "
								+ "chose lizard.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
					case SP:
						println("You win, you chose spock and the computer "
								+ "chose lizard.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));
					case LI:
						println("You both choose lizard");
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
			case SP:
				switch (userChoice) // Switch Statement
				{
					case SC:
						println("You lose, you choose scissors and the "
								+ "computer choose spock.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
					case RO:
						println("You lose, you choose rock and the "
								+ "computer choose spock.");
						return Character.toString(score.charAt(0))
								+ Integer.toString((Integer.parseInt(
										Character.toString(score.charAt(1))))
										+ 1)
								+ Character.toString(score.charAt(2));
					case PA:
						println("You win, you chose paper and the computer "
								+ "chose spock.");
						return Integer
								.toString((Integer.parseInt(
										Character.toString(score.charAt(0))))
								+ 1) + Character.toString(score.charAt(1))
								+ Character.toString(score.charAt(2));
					case SP:
						println("You both choose spock");
						return Character.toString(score.charAt(0))
								+ Character.toString(score.charAt(1))
								+ String.valueOf((Integer
										.parseInt(Character
												.toString(score.charAt(2)))
												+ 1));
					case LI:
						println("You win, you choose lizard and the "
								+ "computer choose spock.");
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
	public void beginGame(Scanner keyboard)
	{
		String userChoice = "roooooooooooook";
		RPS realChoice = RPS.RO;
		boolean canStart = false;
		String userFirstTwoCharacters;
		String score = "000";
		int round = 0;
		boolean bool = true;
		while(bool == true) // Loop 23
		{
			try
			{
				println("How many times do you want to play: ");
				round = keyboard.nextInt(); // Numeric User Input
				bool = false;
			}
			catch(Exception e)
			{
				println("Enter a number you fool");
				bool = true;
			}
			keyboard.nextLine();
		}
		for(int i = 0; i < round; i++) // Loop 24
		{
			canStart = false;
			while(canStart != true) // Loop 25
			{
				println("Pick your object\nScissors\n"
						+ "Rock\nPaper\nLizard\nSpock");
				userChoice = keyboard.nextLine(); // String User Input
				try
				{
					userFirstTwoCharacters = userChoice.substring(0, 2);
					realChoice =
							RPS.valueOf(userFirstTwoCharacters.toUpperCase());
					canStart = true;
				}
				catch(Exception e)
				{
					continue;
				}
			}
			score = this.rockPaperScissors2(realChoice, score);
		}
		println("The computer won %c times, you won %c times, and "
				+ "there were %c ties.\n", score.charAt(1), score.charAt(0),
				score.charAt(2));
		if(Integer.parseInt(String.valueOf(score.charAt(1))) > Integer
				.parseInt(String.valueOf(score.charAt(0)))) // If Statement
		{
			super.loser();
		}
		else if(Integer.parseInt(String.valueOf(score.charAt(1))) < Integer
				.parseInt(String.valueOf(score.charAt(0))))
		{
			super.winner();
		}

	}

	@Override
	public void rules()
	{
		println("Scissors cuts Paper\n" + "Paper covers Rock\n"
				+ "Rock crushes Lizard\n" + "Lizard poisons Spock\n"
				+ "Spock smashes Scissors\n" + "Scissors decapitates Lizard\n"
				+ "Lizard eats Paper\n" + "Paper disproves Spock\n"
				+ "Spock vaporizes Rock\n"
				+ "(and as it always has) Rock crushes Scissors");
	}
}
