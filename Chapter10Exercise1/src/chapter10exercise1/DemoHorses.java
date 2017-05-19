package chapter10exercise1;

import static betterutils.BetterUtils.*;
import java.util.Scanner;

public class DemoHorses
{
	/**
	 * demos the horse
	 */
	public static void demoHorses()
	{
		Scanner keyboard = new Scanner(System.in);
		String[] userAnswers = new String[4];
		String[] userPrompts =
				{ "Enter the horse name: ", "Enter the horse color: ",
						"Enter the horse birth year: ",
						"Enter the race horse name: ",
						"Enter the race horse color: ",
						"Enter the race horse birth year: ",
						"Enter the number of races the horse has ran: " };
		for(int i = 0; i < userAnswers.length - 1; i++)
		{
			println(userPrompts[i]);
			userAnswers[i] = keyboard.nextLine();
		}
		int userRaces = 0;
		Horse horse = new Horse(userAnswers[0], userAnswers[1], userAnswers[2]);
		for(int i = 0; i < userAnswers.length; i++)
		{
			if(i == 3)
			{
				println(userPrompts[i + 3]);
				userRaces = keyboard.nextInt();
			}
			else
			{
				println(userPrompts[i + 3]);
				userAnswers[i] = keyboard.nextLine();
			}
		}
		println("Your normal horse:\nName: %s\nColor: %s\nBirth Year: %s",
				horse.getName(), horse.getColor(), horse.getBirthYear());
		RaceHorse raceHorse = new RaceHorse(userAnswers[0], userAnswers[1],
				userAnswers[2], userRaces);
		println("Your race horse:\nName: %s\nColor: %s\nBirth Year: "
				+ "%s\nRaces Ran: %s", raceHorse.getName(),
				raceHorse.getColor(), raceHorse.getBirthYear(),
				raceHorse.getRacesRan());
		keyboard.close();

	}

	public static void main(String[] args)
	{
		demoHorses();
	}
}
