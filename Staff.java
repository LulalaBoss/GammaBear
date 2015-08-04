/**
 **/
public class Staff
{
	private String firstName;
	private String lastName;	
	
	private int serviceExp;
	private int cookingExp;
	
	public Staff(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
		serviceExp = 0;
		cookingExp = 0;
	}
	
	public String getName()
	{
		return firstName + " " + lastName;
	}
	
}