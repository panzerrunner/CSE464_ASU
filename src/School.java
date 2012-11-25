import java.util.*;
public class School
{

private String schoolName;
private ArrayList <SchoolPerson> schoolPerson;

public School(String name)
{

 schoolName = name;
 schoolPerson = new ArrayList();


}
public void addPerson (SchoolPerson person)
{
	schoolPerson.add(person);
}


public void displaySchoolInfo()
{
	System.out.println("\t\t"+ schoolName);
    System.out.println("\t\t\t =============");

    for(int i=0; i<schoolPerson.size(); i++)
    {
    	schoolPerson.get(i).viewInfo();
    }

}
}