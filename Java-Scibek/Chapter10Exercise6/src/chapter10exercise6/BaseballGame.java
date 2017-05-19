package chapter10exercise6;

import static betterutils.BetterUtils.*;

public class BaseballGame
{
	private String homeTeam;
	private String awayTeam;
	private int innings = 9;
	private int currentInning = 0;
	private int[] homeTeamScore;
	private int[] awayTeamScore;

	/**
	 * builds a baseball game
	 * @param homeTeam - the home team
	 * @param awayTeam - the away team
	 * @param innings - the number of innings to play
	 */
	public BaseballGame(String homeTeam, String awayTeam, int innings)
	{
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.innings = innings;
		this.homeTeamScore = new int[innings];
		this.awayTeamScore = new int[innings];
		for(int i = 0; i < innings; i++)
		{
			this.homeTeamScore[i] = -1;
			this.awayTeamScore[i] = -1;
		}
	}

	/**
	 * builds a baseball game
	 * @param homeTeam - the home team
	 * @param awayTeam - the away team
	 */
	public BaseballGame(String homeTeam, String awayTeam)
	{
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeTeamScore = new int[this.innings];
		this.awayTeamScore = new int[this.innings];
		for(int i = 0; i < this.innings; i++)
		{
			this.homeTeamScore[i] = -1;
			this.awayTeamScore[i] = -1;
		}
	}

	/**
	 * checks to see if game is over
	 * @return - if the game is over or not
	 */
	public boolean isOver()
	{
		try
		{
			return this.homeTeamScore[this.innings - 1] != -1;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	/**
	 * prints the winner
	 */
	public void winner()
	{
		if(this.isOver())
		{
			int homeTeam = 0;
			int awayTeam = 0;
			for(int i = 0; i < innings; i++)
			{
				homeTeam += this.homeTeamScore[i];
				awayTeam += this.awayTeamScore[i];
			}
			if(homeTeam > awayTeam)
			{
				println("The score is %d to %d and the %s wins.", homeTeam,
						awayTeam, this.homeTeam);
			}
			else if(awayTeam > homeTeam)
			{
				println("The score is %d to %d and the %s wins.", homeTeam,
						awayTeam, this.awayTeam);
			}
			else
			{
				println("The score is %d to %d and no one wins.", homeTeam,
						awayTeam);
			}
		}
	}

	/**
	 * gets the home team
	 * @return - the homeTeam
	 */
	public String getHomeTeam()
	{
		return this.homeTeam;
	}

	/**
	 * sets the home team
	 * @param homeTeam - the homeTeam to set
	 */
	public void setHomeTeam(String homeTeam)
	{
		this.homeTeam = homeTeam;
	}

	/**
	 * gets the away team
	 * @return - the away
	 */
	public String getAwayTeam()
	{
		return this.awayTeam;
	}

	/**
	 * sets the away team
	 * @param awayTeam - the awayTeam to set
	 */
	public void setAwayTeam(String awayTeam)
	{
		this.awayTeam = awayTeam;
	}

	/**
	 * gets the number of inning
	 * @return - the inning
	 */
	public int getInnings()
	{
		return this.innings;
	}

	/**
	 * sets the number of innings
	 * @param innings - the inning to set
	 */
	public void setInnings(int innings)
	{
		this.innings = innings;
	}

	/**
	 * get the home team score for certain inning
	 * @param inning - the inning to get score for
	 * @return - the homeTeamScore
	 */
	public int getHomeTeamScore(int inning)
	{
		if(this.isInningAvailable(inning))
		{
			return this.homeTeamScore[inning];
		}
		else
		{
			println("Inning %dis not available yet.", inning);
			return -1;
		}
	}

	/**
	 * sets the home team score for certain inning
	 * @param inning - the inning to set score for
	 * @param homeTeamScore - the homeTeamScore to set
	 */
	public void setHomeTeamScore(int homeTeamScore, int inning)
	{
		if(this.isInningAvailable(inning))
		{
			this.homeTeamScore[inning] = homeTeamScore;
		}
		else
		{
			println("Inning " + inning + " is not available yet.");
		}
	}

	/**
	 * gets the away team score for a certain inning
	 * @param inning - inning to get score for
	 * @return - the awayTeamScore
	 */
	public int getAwayTeamScore(int inning)
	{
		if(this.isInningAvailable(inning))
		{
			return awayTeamScore[inning];
		}
		else
		{
			println("Inning " + inning + " is not available yet.");
			return -1;
		}
	}

	/**
	 * sets the score for a certain inning
	 * @param inning - the inning to set score for
	 * @param awayTeamScore - the awayTeamScore to set
	 */
	public void setAwayTeamScore(int awayTeamScore, int inning)
	{
		if(this.isInningAvailable(inning))
		{
			this.awayTeamScore[inning] = awayTeamScore;
		}
		else
		{
			println("Inning " + inning + " is not available yet.");
		}
	}

	/**
	 * gets the current inning
	 * @return - the currentInning
	 */
	public int getCurrentInning()
	{
		return this.currentInning;
	}

	/**
	 * sets the current inning
	 * @param currentInning - the currentInning to set
	 */
	public void setCurrentInning(int currentInning)
	{
		this.currentInning = currentInning;
	}

	/**
	 * checks if the specified inning is available
	 * @param inning - the inning to check
	 * @return - if the inning is available or not
	 */
	public boolean isInningAvailable(int inning)
	{
		return inning <= this.currentInning;
	}
}
