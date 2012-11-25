
public class Employee extends SchoolPerson 
{
	protected boolean hourlyPaid;
	protected double hourlyRate;
	protected double monthly_salary;
	
	public Employee (String first, String last, boolean hourly_paid, double hourly_rate, double monthly_salary)
	{
		super (first, last);
		hourlyPaid		= hourly_paid;
		hourlyRate		= hourly_rate;
		this.monthly_salary	= monthly_salary;
		
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
