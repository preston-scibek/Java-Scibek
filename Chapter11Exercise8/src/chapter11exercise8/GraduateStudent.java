package chapter11exercise8;

public class GraduateStudent extends Student
{

	/**
	 * builds a student
	 * @param studentID - the id
	 * @param lastName - the last name
	 */
	public GraduateStudent(int studentID, String lastName)
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
		this.annualTuition = 6000;

	}

}
