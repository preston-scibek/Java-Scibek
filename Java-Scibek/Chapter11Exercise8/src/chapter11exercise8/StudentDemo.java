package chapter11exercise8;

import static betterutils.BetterUtils.*;

public class StudentDemo
{
	public static void demoStudents()
	{
		String lastnames = "JoeTomBobNikDanTimMoe";
		UndergraduateStudent[] undergradArray = new UndergraduateStudent[7];
		GraduateStudent[] gradArray = new GraduateStudent[7];
		StudentAtLarge[] atLargeArray = new StudentAtLarge[7];
		for(int i = 0; i < undergradArray.length; i++)
		{
			undergradArray[i] = new UndergraduateStudent(i * 5454,
					lastnames.substring(i * 3, i * 3 + 3));
		}
		for(int i = 0; i < gradArray.length; i++)
		{
			gradArray[i] = new GraduateStudent(i * 3636,
					lastnames.substring(i * 3, i * 3 + 3));
		}
		for(int i = 0; i < atLargeArray.length; i++)
		{
			atLargeArray[i] = new StudentAtLarge(i * 2626,
					lastnames.substring(i * 3, i * 3 + 3));
		}

		println("UNDERGRADUATE STUDENTS\n");
		for(int i = 0; i < undergradArray.length; i++)
		{
			println("Name: %s\nStudent ID: %d\nAnnual Tuition: $%d",
					undergradArray[i].getLastName(),
					undergradArray[i].getStudentID(),
					undergradArray[i].getAnnualTuition());
		}
		println("GRADUATE STUDENTS\n");
		for(int i = 0; i < gradArray.length; i++)
		{
			println("Name: %s\nStudent ID: %d\nAnnual Tuition: $%d",
					gradArray[i].getLastName(), gradArray[i].getStudentID(),
					gradArray[i].getAnnualTuition());
		}
		println("AT LARGE STUDENTS\n");
		for(int i = 0; i < atLargeArray.length; i++)
		{
			println("Name: %s\nStudent ID: %d\nAnnual Tuition: $%d",
					atLargeArray[i].getLastName(),
					atLargeArray[i].getStudentID(),
					atLargeArray[i].getAnnualTuition());
		}
	}

	public static void main(String[] args)
	{
		demoStudents();
	}
}
