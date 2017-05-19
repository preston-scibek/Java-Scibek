package chapter11exercise8;

public abstract class Student
{
	protected int studentID;
	protected String lastName;
	protected int annualTuition;

	/**
	 * builds a student
	 * @param studentID - the id
	 * @param lastName - the last name
	 */
	public Student(int studentID, String lastName)
	{
		this.studentID = studentID;
		this.lastName = lastName;
	}

	/**
	 * gets the id
	 * @return - the student id
	 */
	public int getStudentID()
	{
		return this.studentID;
	}

	/**
	 * gets the last name
	 * @return - the last name
	 */
	public String getLastName()
	{
		return this.lastName;
	}

	/**
	 * gets the annual tuition
	 * @return - the annual tuition
	 */
	public int getAnnualTuition()
	{
		return this.annualTuition;
	}

	/**
	 * sets the student id
	 * @param newID - the new id
	 */
	public void setStudentID(int newID)
	{
		this.studentID = newID;
	}

	/**
	 * sets the last name
	 * @param newName - the new last name
	 */
	public void setLastName(String newName)
	{
		this.lastName = newName;
	}

	/**
	 * sets the new tuition
	 */
	public abstract void setTuition();
}
