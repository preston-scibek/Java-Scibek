package chapter10exercise8;

import static betterutils.BetterUtils.*;

public class CollegeCourse
{
	private String department;
	private int courseNumber;
	private int credits;
	private int cost;

	/**
	 * makes a course
	 * @param department - the department name
	 * @param courseNumber - the course number
	 * @param credits - the credit amount
	 */
	public CollegeCourse(String department, int courseNumber, int credits)
	{
		this.setDepartment(department);
		this.setCourseNumber(courseNumber);
		this.credits = credits;
		this.cost = this.credits * 120;
	}

	/**
	 * gets the department
	 * @return - the department
	 */
	public String getDepartment()
	{
		return department;
	}

	/**
	 * sets the department
	 * @param department - the department to set
	 */
	public void setDepartment(String department)
	{
		this.department = department;
	}

	/**
	 * gets the courseNumber
	 * @return - the courseNumber
	 */
	public int getCourseNumber()
	{
		return this.courseNumber;
	}

	/**
	 * sets the courseNumber
	 * @param courseNumber - the courseNumber to set
	 */
	public void setCourseNumber(int courseNumber)
	{

		this.courseNumber = courseNumber;
	}

	/**
	 * gets the cost
	 * @return - the cost
	 */
	public int getCost()
	{
		return this.cost;
	}

	/**
	 * sets the cost
	 * @param cost - the cost to set
	 */
	public void setCost(int cost)
	{
		this.cost = cost;
	}

	/**
	 * gets the credits
	 * @return - the credits
	 */
	public int getCredits()
	{
		return this.credits;
	}

	/**
	 * sets the credits
	 * @param credits - the credits to set
	 */
	public void setCredits(int credits)
	{
		this.credits = credits;
	}

	/**
	 * displays the course data
	 */
	public void display()
	{
		println("Department: %s\nCourse Number: %d\nCredits: %d\nCost: %d",
				this.department, this.courseNumber, this.credits, this.cost);
	}
}
