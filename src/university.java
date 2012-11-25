
import java.util.*;
public class university
{

  public static void main(String[] args)
  {

     School engSchool = new School("Fulton Schools of Engineering");

	 Student s = new Student("John", "William", "Freshman", 3.5, "CS/CSE");
	 Faculty f = new Faculty("Janaka", "Balasooriya",  false, 0, 1000.00, "CIDSE", "SOA");
	 OfficeStaff os= new OfficeStaff("Nancy", "Wilfred", true, 20.00, 0);
	 TechnicalSupportStaff ts = new TechnicalSupportStaff("Chris", "Kevin" , false, 0, 12000.50, "Database");

	 engSchool.addPerson(s);
	 engSchool.addPerson(f);
	 engSchool.addPerson(os);
	 engSchool.addPerson(ts);

	 engSchool.displaySchoolInfo();



  }

}