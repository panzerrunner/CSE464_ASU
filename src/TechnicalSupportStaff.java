
public class TechnicalSupportStaff extends Employee 
{
	private String technicalArea;
	
	public TechnicalSupportStaff (String first, String last, boolean hourly_paid, double hourly_rate, double monthly_salary, String tech_area)
	{
		super (first, last, hourly_paid, hourly_rate, monthly_salary);
		technicalArea = tech_area;
	}
	
	public void viewInfo()
	{
		  System.out.println();
	      System.out.println("First Name:" + firstName);
		  System.out.println("Last Name:" + lastName);
		  System.out.println("Technical Area:" + technicalArea);
		  if(hourlyPaid)
		   System.out.println("Hourly Rate:" + hourlyRate);
		  else
	      System.out.println("Monthly Salary:" + monthly_salary);
	}
}
