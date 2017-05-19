package chapter4exercise5;

public class TestBread
{
	public static void main(String[] args)
	{
		Bread whiteBread = new Bread("White", 130);
		Bread wheatBread = new Bread("Wheat", 75);
		Bread ryeBread = new Bread("Rye", 120);
		System.out.printf(
				"%s bread has %.2f calories per slice. The motto" + " is %s.\n",
				whiteBread.getBreadType(), whiteBread.getCaloriesPerSlice(),
				Bread.MOTTO);
		System.out.printf(
				"%s bread has %.2f calories per slice. The motto" + " is %s\n",
				wheatBread.getBreadType(), wheatBread.getCaloriesPerSlice(),
				Bread.MOTTO);
		System.out.printf(
				"%s bread has %.2f calories per slice. The motto" + " is %s.\n",
				ryeBread.getBreadType(), ryeBread.getCaloriesPerSlice(),
				Bread.MOTTO);
	}
}
