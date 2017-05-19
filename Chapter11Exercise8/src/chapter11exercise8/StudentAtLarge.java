package chapter11exercise8;

public class StudentAtLarge extends Student
{

	/**
	 * builds a student
	 * @param studentID - the id
	 * @param lastName - the last name
	 */
	public StudentAtLarge(int studentID, String lastName)
	{
		super(studentID, lastName);
		this.setTuition();
	}

	/**
	 * sets the new tuition
	 */
	@Override
	public void setTuition()
	{
		this.annualTuition = 2000;

	}

}
