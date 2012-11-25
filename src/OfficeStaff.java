
public class OfficeStaff extends Employee
{
	public OfficeStaff (String first, String last, boolean hourly_paid, double hourly_rate, double monthly_salary)
	{
		super (first, last, hourly_paid, hourly_rate, monthly_salary);
	}
	
	public void viewInfo()
	{
		 System.out.println();
		  System.out.println("First Name:" + firstName);
		  System.out.println("Last Name:" + lastName);
		  if(hourlyPaid)
		   System.out.println("Hourly Rate:" + hourlyRate);
		  else
	      System.out.println("Monthly Salary:" + monthly_salary);
	}
}
