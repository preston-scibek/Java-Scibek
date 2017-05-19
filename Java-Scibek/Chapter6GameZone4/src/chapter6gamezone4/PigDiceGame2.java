package chapter6gamezone4;

import java.util.Random;
import javax.swing.JOptionPane;

public class PigDiceGame2
{
	/**
	 * plays the pig game with the user and the computer
	 */
	public static void pigDieGame()
	{
		final int WINNER = 100;
		final int USER = 0;
		Die diceOne = new Die();
		Die diceTwo = new Die();
		int userScore = 0;
		int computerScore = 0;
		int turn = 0;
		final int COMPUTER = 1;
		int curRound = 0;
		while(userScore <= WINNER && computerScore <= WINNER)
		{
			if(turn == USER)
			{
				int choice;
				choice = JOptionPane.showConfirmDialog(null, "Roll the dice?");
				if(choice == 0)
				{
					diceOne.setRolledNumber();
					diceTwo.setRolledNumber();
					System.out.printf(
							"Its the users turn.\nYour score is %" + "d.\n",
							userScore);
					System.out.printf("Your dice rolls were %d and %d.\n",
							diceOne.getRolledNumber(),
							diceTwo.getRolledNumber());
					if(diceOne.getRolledNumber() == 1
							&& diceTwo.getRolledNumber() == 1)
					{
						userScore = 0;
						turn = COMPUTER;
						curRound = 0;
						continue;
					}
					else
					{
						if((diceOne.getRolledNumber() == 1
								|| diceTwo.getRolledNumber() == 1)
								&& diceOne.getRolledNumber() != diceTwo
										.getRolledNumber())
						{
							userScore -= curRound;
							if(userScore < 0)
							{
								userScore = 0;
							}
							curRound = 0;
							turn = COMPUTER;
							continue;
						}
						else
						{
							curRound += diceOne.getRolledNumber()
									+ diceTwo.getRolledNumber();
							userScore += diceOne.getRolledNumber()
									+ diceTwo.getRolledNumber();
							int chooseToGoAgain;
							chooseToGoAgain = JOptionPane
									.showConfirmDialog(null, "Go again?");
							if(chooseToGoAgain == 0)
							{
								continue;
							}
							else
							{
								curRound = 0;
								turn = COMPUTER;
								continue;
							}
						}
					}
				}
				else if(choice == 1)
				{
					turn = 1;
					continue;
				}
			}
			if(turn == COMPUTER)
			{
				System.out.printf(
						"Its the computers turn.\nTheir" + " score is %d.\n",
						computerScore);
				diceOne.setRolledNumber();
				diceTwo.setRolledNumber();
				System.out.printf("Their dice rolls were %d and %d.\n",
						diceOne.getRolledNumber(), diceTwo.getRolledNumber());
				if(diceOne.getRolledNumber() == 1
						&& diceTwo.getRolledNumber() == 1)
				{
					computerScore = 0;
					turn = USER;
					curRound = 0;
					continue;
				}
				else
				{
					if((diceOne.getRolledNumber() == 1
							|| diceTwo.getRolledNumber() == 1)
							&& diceOne.getRolledNumber() != diceTwo
									.getRolledNumber())
					{
						computerScore -= curRound;
						if(computerScore < 0)
						{
							computerScore = 0;
						}
						curRound = 0;
						turn = USER;
						continue;
					}
					else
					{
						curRound += diceOne.getRolledNumber()
								+ diceTwo.getRolledNumber();
						computerScore = diceOne.getRolledNumber()
								+ diceTwo.getRolledNumber();
						double chooseToGoAgain;
						Random rand = new Random();
						chooseToGoAgain = rand.nextDouble();
						if(chooseToGoAgain >= .5)
						{

							continue;
						}
						else
						{
							turn = USER;
							curRound = 0;
							continue;

						}
					}
				}
			}

		}
		if(computerScore > userScore)
		{
			System.out.println("The computer won.");
		}
		else
		{
			System.out.println("The user won.");
		}
	}

	public static void main(String[] args)
	{
		pigDieGame();
	}
}
