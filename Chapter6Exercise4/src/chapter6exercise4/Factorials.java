package chapter6exercise4;

public class Factorials
{
	/**
	 * gives the factorial of every number up to 10
	 */
	public static void factorial()
	{
		int inc;
		int resFactorial = 1;
		for(inc = 1; inc <= 10; inc += 1)
		{
			resFactorial *= inc;
			System.out.printf("The Factorial of %d is" + " %d\n", inc,
					resFactorial);
		}
	}

	public static void main(String[] args)
	{
		factorial();
	}
}
