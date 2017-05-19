package chapter10exercise8;

import static betterutils.BetterUtils.*;

public class LabCourse extends CollegeCourse
{
	/**
	 * builds a lab course
	 * @param department - department code
	 * @param courseNumber - course number
	 * @param credits - credits
	 */
	public LabCourse(String department, int courseNumber, int credits)
	{
		super(department, courseNumber, credits);
		this.setCost(this.getCost() + 50);
	}

	@Override
	public void display()
	{
		println("This is a lab course.");
		super.display();
	}

}
