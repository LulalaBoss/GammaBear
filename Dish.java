/**
 **/
public class Dish
{
	private String name;		
	private int prepTime;
	
	public Dish(String name, int pTime)
	{
		this.name = name;
        prepTime = pTime;
	}
	
	public String getName()
	{
		return name;
	}
	
}