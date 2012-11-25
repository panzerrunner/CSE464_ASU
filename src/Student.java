
public class Student extends SchoolPerson
{
	private String major;
	private double gpa;
	private String academicLevel;
	
	public Student (String first, String last, String major, double gpa, String academicLevel)
	{
		super (first, last);
		this.major 			= major;
		this.gpa			= gpa;
		this.academicLevel	= academicLevel;
	}
	
	public void viewInfo()
	{
		System.out.println();
		System.out.println("First Name :" + firstName);
		System.out.println("Last Name :" + lastName);
		System.out.println("Major:" + major);
		System.out.println("GPA :" + gpa);
		System.out.println("academic Level :" + academicLevel);
	}

}
