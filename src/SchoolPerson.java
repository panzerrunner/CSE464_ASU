
abstract public class SchoolPerson {
	protected String firstName;
	protected String lastName;
	
	public SchoolPerson (String first, String last)
	{
		firstName 	= first;
		lastName 	= last;
	}
	
	public abstract void viewInfo();

}
