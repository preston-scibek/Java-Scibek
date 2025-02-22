package chapter6gamezone4;

import java.util.Random;
import javax.swing.JOptionPane;

public class PigDiceGame
{
	/**
	 * plays the pig game with the user and the computer
	 */
	public static void pigDieGame()
	{
		final int WINNER = 100;
		Die diceOne = new Die();
		Die diceTwo = new Die();
		int userScore = 0;
		int computerScore = 0;
		int turn = 0;
		while(userScore <= WINNER && computerScore <= WINNER)
		{
			if(turn == 0)
			{
				System.out.printf(
						"Its the users turn.\nYour score is %" + "d.\n",
						userScore);
				int choice;
				choice = JOptionPane.showConfirmDialog(null, "Roll the dice?");
				if(choice == 0)
				{
					diceOne.setRolledNumber();
					diceTwo.setRolledNumber();
					System.out.printf("Your dice rolls were %d and %d.\n",
							diceOne.getRolledNumber(),
							diceTwo.getRolledNumber());
					if(diceOne.getRolledNumber() == 1
							&& diceTwo.getRolledNumber() == 1)
					{
						userScore = 0;
						turn = 1;
						continue;
					}

					else
					{
						if((diceOne.getRolledNumber() == 1
								|| diceTwo.getRolledNumber() == 1)
								&& diceOne.getRolledNumber() != diceTwo
										.getRolledNumber())
						{
							turn = 1;
							continue;
						}
						else
						{
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
								turn = 1;
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
			if(turn == 1)
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
					turn = 0;
					continue;
				}
				else
				{
					if((diceOne.getRolledNumber() == 1
							|| diceTwo.getRolledNumber() == 1)
							&& diceOne.getRolledNumber() != diceTwo
									.getRolledNumber())
					{
						turn = 0;
						continue;
					}
					else
					{
						computerScore += diceOne.getRolledNumber()
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
							turn = 0;
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
