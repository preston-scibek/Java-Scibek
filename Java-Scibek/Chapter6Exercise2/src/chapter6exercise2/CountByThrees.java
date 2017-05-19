package chapter6exercise2;

public class CountByThrees
{
	/**
	 * counts by the number 3 up to 300
	 */
	public static void countByThrees()
	{
		int inc = 3;
		for(inc = 3; inc <= 300; inc += 3)
		{
			if(inc % 30 == 0)
			{
				System.out.printf("%d\n", inc);
			}
			else
			{
				System.out.printf("%d, ", inc);
			}
		}
	}

	public static void main(String[] args)
	{
		countByThrees();
	}
}
