package chapter10exercise1;

public class RaceHorse extends Horse
{
	private int racesRan;

	/**
	 * builds a horse
	 * @param name - name of new horse
	 * @param color - color of new horse
	 * @param birthYear - birth year of new horse
	 * @param racesRan - the number of races ran
	 */
	public RaceHorse(String name, String color, String birthYear, int racesRan)
	{
		super(name, color, birthYear);
		this.racesRan = racesRan;
	}

	/**
	 * gets races ran
	 * @return - the racesRan
	 */
	public int getRacesRan()
	{
		return this.racesRan;
	}

	/**
	 * sets races ran
	 * @param racesRan - the racesRan to set
	 */
	public void setRacesRan(int racesRan)
	{
		this.racesRan = racesRan;
	}
}
