package chapter10exercise8;

import static betterutils.BetterUtils.*;
import java.util.Scanner;

public class UseCourse
{
	/**
	 * demos the lab courses
	 */
	public static void demoLabCourse()
	{
		Scanner keyboard = new Scanner(System.in);
		String userCourse = " ";
		int userCredits = 0;
		int userCourseNumber = 0;
		println("Enter the course name: ");
		userCourse = keyboard.nextLine().toUpperCase();
		println("Enter the course number: ");
		userCourseNumber = keyboard.nextInt();
		println("Enter the credit amount: ");
		userCredits = keyboard.nextInt();
		LabCourse userLab;
		CollegeCourse userCollegeCourse;
		switch (userCourse)
		{
			case "BIO":
				userLab = new LabCourse(userCourse, userCourseNumber,
						userCredits);
				userLab.display();
				break;
			case "CHM":
				userLab = new LabCourse(userCourse, userCourseNumber,
						userCredits);
				userLab.display();
				break;
			case "CIS":
				userLab = new LabCourse(userCourse, userCourseNumber,
						userCredits);
				userLab.display();
				break;
			case "PHY":
				userLab = new LabCourse(userCourse, userCourseNumber,
						userCredits);
				userLab.display();
				break;
			default:
				userCollegeCourse = new CollegeCourse(userCourse,
						userCourseNumber, userCredits);
				userCollegeCourse.display();
				break;
		}
		keyboard.close();
	}

	public static void main(String[] args)
	{
		demoLabCourse();
	}
}
