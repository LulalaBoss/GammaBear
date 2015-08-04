/**
 **/
public class Staff
{
	private String firstName;
	private String lastName;	
	
	private int serviceExp;
	private int cookingExp;
	
	private int shift;
	
	public Staff(String fName, String lName, int shift)
	{
		firstName = fName;
		lastName = lName;
		serviceExp = 0;
		cookingExp = 0;
		this.shift = shift;
	}
	
	public String getName()
	{
		return firstName + " " + lastName;
	}
	
	public String getShift()
	{
		String shiftString;
		
		switch(shift)
		{
			case 1: shiftString = "Morning";
			        break;
			case 2: shiftString = "Noon";
			        break;
			case 3: shiftString = "Evening";
			        break;
			case 4: shiftString = "Night";
			        break;
			default: shiftString = "Not Assigned";
		}
		
		return shiftString;
	}
	
}