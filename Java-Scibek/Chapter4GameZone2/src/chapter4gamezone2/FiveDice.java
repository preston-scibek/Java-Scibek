package chapter4gamezone2;

public class FiveDice
{
	/**
	 * displays the results of five dice rolls.
	 */
	public static void throwDie(String whoIsThisFor)
	{
		Die dieOne = new Die();
		Die dieTwo = new Die();
		Die dieThree = new Die();
		Die dieFour = new Die();
		Die dieFive = new Die();
		System.out.printf(
				"The %s's " + "rolls were as follows.\n%d\t%d\t%d\t%d\t%d\n",
				whoIsThisFor, dieOne.getRolledNumber(),
				dieTwo.getRolledNumber(), dieThree.getRolledNumber(),
				dieFour.getRolledNumber(), dieFive.getRolledNumber());
	}

	public static void main(String[] args)
	{
		throwDie("Computer");
		throwDie("User");
	}
}
