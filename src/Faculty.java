
public class Faculty extends Employee 
{
	private String department;
	private String researchArea;
	
	public Faculty (String first, String last, boolean hourly_paid, double hourly_rate, double monthly_salary, String dpt, String area)
	{
		super (first, last, hourly_paid, hourly_rate, monthly_salary);
		department		= dpt;
		researchArea	= area;
	}
	
	public void viewInfo()
	{
		 System.out.println();
		  System.out.println("First Name:" + firstName);
		  System.out.println("Last Name:" + lastName);
		  System.out.println("Department:" + department);
		  System.out.println("Research Area:" + researchArea);
		  if(hourlyPaid)
		   System.out.println("Hourly Rate:" + hourlyRate);
		  else
		   System.out.println("Monthly Salary:" + monthly_salary);
	}

}
